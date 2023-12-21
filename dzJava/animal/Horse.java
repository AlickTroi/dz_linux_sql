package dzJava.animal;

public class Horse extends PackAnimal {
    public Horse(int id, String name, int year, int mounth, int day){
        super(id, name, year, mounth, day);
        setKind("horse");
    }
}
