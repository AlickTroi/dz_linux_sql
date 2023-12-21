package dzJava.terminal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import dzJava.ArrayAnimal.AnimalArray;
import dzJava.ArrayAnimal.PackAnimalArray;
import dzJava.ArrayAnimal.PetArray;
import dzJava.animal.Animal;
import dzJava.animal.Camel;
import dzJava.animal.Cat;
import dzJava.animal.Dog;
import dzJava.animal.Donkey;
import dzJava.animal.Hamster;
import dzJava.animal.Horse;
import dzJava.animal.PackAnimal;
import dzJava.animal.Pet;

public class ConsoleView {
    private Scanner scanner;
    private AnimalArray animalArray;
    private PetArray petArray;
    private PackAnimalArray packAnimalArray;
    private boolean work;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
        this.animalArray = new AnimalArray();
        this.petArray = new PetArray();
        this.packAnimalArray = new PackAnimalArray();
        this.work = true;
    }

    public void start() {
        greeting();
        while (work) {
            mainMenu();
        }
    }

    public void greeting() {
        System.out.println("Здравствуйте вы можете добавить питомца");
    }

    // создать выйти и вывести
    public void mainMenu() {
        System.out.println("количество животных: " + this.animalArray.getSize());
        System.out.println("выберите действие: ");
        System.out.println("1 - создать");
        System.out.println("2 - вывести всех");
        System.out.println("3 - выйти");
        String sc = scanner.nextLine();
        switch (sc) {
            case "1":
                createAnimal();
                break;
            case "2":
                this.animalArray.sortByAge();
                System.out.println(this.animalArray.getInfo());
                break;
            case "3":
                this.work = false;
                break;

            default:
                helper();
                mainMenu();
                break;
        }
    }

    public void helper() {
        System.out.println("что то пошло не так, попробуйте еще раз!");
    }

    // создать питомца или зверя
    public void createAnimal() {
        System.out.println("выберите действие: ");
        System.out.println("1 - создать питомца");
        System.out.println("2 - создать дикое животное");
        System.out.println("3 - назад");
        String sc = scanner.nextLine();
        switch (sc) {
            case "1":
                createPet();
                break;
            case "2":
                createPackAnimal();
                break;
            case "3":
                mainMenu();
                break;

            default:
                helper();
                createAnimal();
                break;
        }
    }

    public void createPet() {
        System.out.println("выберите кого вы хотите создать: ");
        System.out.println("1 - кот");
        System.out.println("2 - собака");
        System.out.println("3 - хомяк");
        System.out.println("4 - назад");
        String sc = scanner.nextLine();
        int id;
        String name;
        int[] data;
        Animal animal;
        switch (sc) {
            case "1":
                id = createId();
                name = createName();
                data = createData();
                animal = new Cat(id, name, data[0], data[1], data[2]);
                addAbilityPets(animal);
                break;
            case "2":
                id = createId();
                name = createName();
                data = createData();
                animal = new Dog(id, name, data[0], data[1], data[2]);
                addAbilityPets(animal);
                break;
            case "3":
                id = createId();
                name = createName();
                data = createData();
                animal = new Hamster(id, name, data[0], data[1], data[2]);
                addAbilityPets(animal);
                break;
            case "4":
                createPet();
                break;
            default:
                helper();
                createPet();
                break;
        }
    }

    public void createPackAnimal() {
        System.out.println("выберите кого вы хотите создать: ");
        System.out.println("1 - лошадь");
        System.out.println("2 - верблюд");
        System.out.println("3 - осел");
        System.out.println("4 - назад");
        String sc = scanner.nextLine();
        int id;
        String name;
        int[] data;
        Animal animal;
        switch (sc) {
            case "1":
                id = createId();
                name = createName();
                data = createData();
                animal = new Horse(id, name, data[0], data[1], data[2]);
                addAbilityPets(animal);
                break;
            case "2":
                id = createId();
                name = createName();
                data = createData();
                animal = new Camel(id, name, data[0], data[1], data[2]);
                addAbilityPets(animal);
                break;
            case "3":
                id = createId();
                name = createName();
                data = createData();
                animal = new Donkey(id, name, data[0], data[1], data[2]);
                addAbilityPets(animal);
                break;
            case "4":
                createPackAnimal();
                break;
            default:
                helper();
                createPackAnimal();
                break;
        }
    }

    public void addAbilityPets(Animal animal) {
        System.out.println("выберите что вы хотите сделать: ");
        System.out.println("1 - добавить способность");
        System.out.println("2 - завершить");
        String sc = scanner.nextLine();
        switch (sc) {
            case "1":
                animal.addCommands(addAbility());
                addAbilityPets(animal);
                break;
            default:
                addInPets(animal);
                addInAnimalsArray(animal);
                break;
        }
    }

    public void addAbilityPackAnimal(Animal animal) {
        System.out.println("выберите что вы хотите сделать: ");
        System.out.println("1 - добавить способность");
        System.out.println("2 - завершить");
        String sc = scanner.nextLine();
        switch (sc) {
            case "1":
                animal.addCommands(addAbility());
                addAbilityPets(animal);
                break;
            default:
                addInPackAnimals(animal);
                addInAnimalsArray(animal);
                break;
        }
    }

    public void addInPets(Animal animal) {
        this.petArray.addAnimal(animal);
    }

    public void addInPackAnimals(Animal animal) {
        this.packAnimalArray.addAnimal(animal);
    }

    public void addInAnimalsArray(Animal animal) {
        this.animalArray.addAnimal(animal);
    }

    public int createId() {
        System.out.println("введите id: ");
        String idStr = scanner.nextLine();
        return Integer.parseInt(idStr);
    }

    public String createName() {
        System.out.println("введите имя: ");
        return scanner.nextLine();

    }

    public int[] createData() {
        int[] data = new int[3];
        System.out.println("введите год: ");
        String yearStr = scanner.nextLine();
        int year = Integer.parseInt(yearStr);
        System.out.println("введите месяц: ");
        String mounthStr = scanner.nextLine();
        int mounth = Integer.parseInt(mounthStr);
        System.out.println("введите день: ");
        String dayStr = scanner.nextLine();
        int day = Integer.parseInt(dayStr);

        if (isValidDate(day + "/" + mounth + "/" + year)) {
            data[0] = year;
            data[1] = mounth;
            data[2] = day;
            return data;
        } else {
            System.out.println("Вы ввели не верную дату, повторите еще раз");
            createData();
        }
        return data;
    }

    private static boolean isValidDate(String input) {
        String formatString = "dd/MM/yyyy";

        try {
            SimpleDateFormat format = new SimpleDateFormat(formatString);
            format.setLenient(false);
            format.parse(input);
        } catch (ParseException | IllegalArgumentException e) {
            return false;
        }

        return true;
    }

    public String addAbility() {
        System.out.println("введите назваие способности: ");
        return scanner.nextLine();
    }

    // System.out.println(isValidDate("12/31/2111"))
}
