package oopPrinciples.inheritance.furnitures;

public class Table extends Furniture{

    public Table(){
        System.out.println("This is table class 0 arg constructor");
    }

    public Table(String name){
        super(name);
        System.out.println("This is table class 1 arg constructor");
    }

    public Table(String name, String material){
        super(name, material);
        System.out.println("This is table class 2 arg constructor");
    }
}
