package oopPrinciples.inheritance.furnitures;

public class Furniture {

    public Furniture(){
        System.out.println("This is furniture class 0 arg constructor");
    }

    public Furniture(String name){
        this();
        this.name = name;
        System.out.println("This is furniture class 1 arg constructor");
    }

    public Furniture(String name, String material){
        this(name);
        this.material = material;
        System.out.println("This is furniture class 2 args constructor");
    }

    public String name;
    public String material;


    public void printInfo(){
        System.out.println("[" +
                            "name: " + name + ", " +
                            "material: " + material +
                            "]");
    }
}
