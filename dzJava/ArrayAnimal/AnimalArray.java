package dzJava.ArrayAnimal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dzJava.animal.Animal;

public class AnimalArray<E extends Animal> {
    private List<E> animalArray;

    AnimalArray(List<E> animalArray) {
        this.animalArray = animalArray;
    }

    public AnimalArray() {
        this.animalArray = new ArrayList<>();
    }

    public void addAnimalArray(List<E> animalArray) {
        this.animalArray.addAll(animalArray);
    }

    public void addAnimalArray(List<E> animalArray, List<E> animalArrayTwo) {
        this.animalArray.addAll(animalArray);
        this.animalArray.addAll(animalArrayTwo);
    }

    public void addAnimal(E animal) {
        this.animalArray.add(animal);
    }

    public int getSize() {
        return animalArray.size();
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        sb.append("всего животных: ");
        sb.append(animalArray.size());
        sb.append("\n объектов: \n");
        for (E E : animalArray) {
            sb.append(E.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void sortByAge(){
        Collections.sort(animalArray, new AnimalComporatorByAge<>());
    }
}
