package dzJava.animal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

abstract public class Animal{
    private int id;
    private String name;
    private Date boring;
    private String kind;  
    private ArrayList<String> comands;


    Animal(int id, String name, int year, int mounth, int day) {
        this.id = id;
        this.name = name;
        this.boring = new Date(year, mounth, day);
        this.comands = new ArrayList<String>();
    }

    

    public ArrayList<String> getCommands() {
        return this.comands;
    }

    public void addCommands(String command) {
        this.comands.add(command);
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public Date getBoring() {
        return this.boring;
    }

    public String getKind() {
        return this.kind;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBoring(Date boring) {
        this.boring = boring;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("kind: " + kind);
        sb.append("\nid: " + id);
        sb.append("\nname: " + name);
        sb.append("\nboring: Year " + boring.getYear() + " Month" + boring.getMonth() + " Day " + boring.getDate());
        sb.append("\ncomands:  " + comands);
        return sb.toString();
    }
}