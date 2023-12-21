package dzJava.animal;

public class Dog extends Pet {
    public Dog(int id, String name, int year, int mounth, int day){
        super(id, name, year, mounth, day);
        setKind("dog");
    }
}

