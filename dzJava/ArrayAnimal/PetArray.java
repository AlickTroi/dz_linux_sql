package dzJava.ArrayAnimal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dzJava.animal.Animal;

public class PetArray<E extends Animal> {
    private List<E> petArray;

    PetArray(List<E> petArray) {
        this.petArray = petArray;
    }

    public PetArray() {
        this.petArray = new ArrayList<>();
    }

    public void addAnimal(E animal) {
        this.petArray.add(animal);
    }

    public int getSize() {
        return petArray.size();
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        sb.append("всего животных: ");
        sb.append(petArray.size());
        sb.append("\n объектов: \n");
        for (E E : petArray) {
            sb.append(E.toString());
            sb.append(" " + count++);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void sortByAge(){
        Collections.sort(petArray, new AnimalComporatorByAge<>());
    }
}
