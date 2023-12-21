package dzJava.animal;


public class Cat extends Pet {

    public Cat(int id, String name, int year, int mounth, int day){
        super(id, name, year, mounth, day);
        setKind("cat");

    }   
}
