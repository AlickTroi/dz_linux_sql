package dzJava.ArrayAnimal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dzJava.animal.Animal;

public class PackAnimalArray<E extends Animal> {
    private List<E> packAnimal;

    PackAnimalArray(List<E> packAnimal) {
        this.packAnimal = packAnimal;
    }

    public PackAnimalArray() {
        this.packAnimal = new ArrayList<>();
    }

    public void addAnimal(E animal) {
        this.packAnimal.add(animal);
    }

    public int getSize() {
        return packAnimal.size();
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        sb.append("всего животных: ");
        sb.append(packAnimal.size());
        sb.append("\n объектов: \n");
        for (E E : packAnimal) {
            sb.append(E.toString());
            sb.append(" " + count++);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void sortByAge(){
        Collections.sort(packAnimal, new AnimalComporatorByAge<>());
    }
}


 
