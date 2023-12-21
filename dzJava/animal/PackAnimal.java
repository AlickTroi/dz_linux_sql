package dzJava.animal;

public abstract class PackAnimal extends Animal {

    private String typeOfAnimal;

    PackAnimal(int id, String name, int year, int mounth, int day) {
        super(id, name, year, mounth, day);
        this.typeOfAnimal = "Pack_animal";
    }

    public String getTypeOfAnimal() {
        return this.typeOfAnimal;
    }
}