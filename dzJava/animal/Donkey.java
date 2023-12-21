package dzJava.animal;

public class Donkey extends PackAnimal {
    public Donkey(int id, String name, int year, int mounth, int day){
        super(id, name, year, mounth, day);
        setKind("donkey");
    }
}
