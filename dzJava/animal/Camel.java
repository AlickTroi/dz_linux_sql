package dzJava.animal;

public class Camel extends PackAnimal {
    public Camel(int id, String name, int year, int mounth, int day){
        super(id, name, year, mounth, day);
        setKind("camel");
    }
}
