package dzJava.ArrayAnimal;

import dzJava.animal.Animal;
import java.util.Comparator;

public class AnimalComporatorByAge <E extends Animal> implements Comparator<E> {

    @Override
    public int compare(E o1, E o2) {  
        return Integer.compare(o1.getBoring().getDate(), o2.getBoring().getDate());
    }
}