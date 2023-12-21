package dzJava.animal;

public class Hamster extends Pet {
    public Hamster(int id, String name, int year, int mounth, int day){
        super(id, name, year, mounth, day);
        setKind("hamster");
    }
}