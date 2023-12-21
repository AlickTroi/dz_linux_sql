package dzJava.animal;

public abstract class Pet extends Animal{
    private String typeOfAnimal;

    Pet(int id, String name, int year, int mounth, int day){
        super(id, name, year, mounth, day);
        this.typeOfAnimal = "Pet";
    }

    public String getTypeOfAnimal() {
        return this.typeOfAnimal;
    } 

    // @Override
    // public String toString() {
    //     StringBuilder sb = new StringBuilder();
    //     sb.append("Pet: Pet");
    //     sb.append("\nkind: " + kind);
    //     sb.append("\nid: " + id);
    //     sb.append("\nname: " + name);
    //     sb.append("\nboring: Year " + boring.getYear() + " Month" + boring.getMonth() + " Day " + boring.getDate());
    //     sb.append("\ncomands:  " + comands);
    //     return sb.toString();
    // }
}
