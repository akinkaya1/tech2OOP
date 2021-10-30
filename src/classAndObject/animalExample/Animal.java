package classAndObject.animalExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Animal {

    /*
    Instance variables
    name
    color
    family
    carnivore
    herbivore
    omnivore
     */

    static final boolean hasEyes = true;
    String name;
    String color;
    String family;
    boolean isCarnivore;
    boolean isHerbivore;
    boolean isOmnivore;

    public void printInfo(){ // non-static void method - zero args
        if(name != null) System.out.println("Name is = " + name);
        if(color != null) System.out.println("Color is = " + color);
        if(family != null) System.out.println("Family is = " + family);
        if(isCarnivore) System.out.println("Is carnivore = " + isCarnivore);
        if(isHerbivore) System.out.println("Is herbivore = " + isHerbivore);
        if(isOmnivore) System.out.println("Is omnivore = " + isOmnivore);
        System.out.println("Has eyes = " + hasEyes);
    }

    public static String toString(Animal animal){ // static, return type- 1 arg
        return "[" +
                "Name: " + animal.name + ", " +
                "Color: " + animal.color + ", " +
                "Family: " + animal.family + ", " +
                "isCarnivore: " + animal.isCarnivore + ", " +
                "isOmnivore: " + animal.isOmnivore + ", " +
                "isHerbivore: " + animal.isHerbivore + ", " +
                "hasEyes: " + hasEyes +
                "]";
    }





    public static void main(String[] args) {
        /*
        Create an a2 Animal object
        And define its information as below
        Cow
        Black
        Mammal
        Herbivore

        Create an a3 Animal object
        And define its information as below
        Cat
        Gray
        Mammal
        Omnivore

        Create an a4 Animal object
        And define its information as below
        Parrot
        White
        Bird
        Herbivore

        Print their information
         */
        Animal a1 = new Animal();
        a1.name = "Lion";
        a1.color = "Beige";
        a1.family = "Mammal";
        a1.isCarnivore = true;

        Animal a2 = new Animal();
        a2.name = "Cow";
        a2.color = "Black/White";
        a2.family = "Mammal";
        a2.isHerbivore = true;

        Animal a3 = new Animal();
        a3.name = "Cat";
        a3.color = "Grey";
        a3.family = "Mammal";
        a3.isOmnivore = true;

        Animal a4 = new Animal();
        a4.name = "Parrot";
        a4.color = "White";
        a4.family = "Bird";
        a4.isHerbivore = true;

        System.out.println("PRINTING INFO WITH ARRAY AND FOR EACH LOOP");
        Animal[] animalsList = {a1, a2, a3, a4};

        for(Animal animal: animalsList){
            System.out.println("\n-------------------------------------------------------\n");
            animal.printInfo();
        }

        System.out.println("\nPRINTING INFO WITH ARRAYLIST AND FOR I LOOP");
        List<Animal> aList = new ArrayList<>();
        aList.add(a1);
        aList.add(a2);
        aList.add(a3);
        aList.add(a4);

        for (int i = 0; i < aList.size(); i++) {
            System.out.println("\n-------------------------------------------------------\n");
            aList.get(i).printInfo();
        }

        System.out.println("\nPRINTING EACH ANIMAL ELEMENT AS A STRING");
        for (Animal animal: animalsList){
            System.out.println("\n-------------------------------------------------------\n");
            System.out.println(Animal.toString(animal));
        }
    }
}
