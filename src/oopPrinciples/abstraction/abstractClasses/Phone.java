package oopPrinciples.abstraction.abstractClasses;

public abstract class Phone {
    public Phone(){
        //default constructor
    }

    public Phone(String brand, String color, int storage, double price){
        this.brand = brand;
        this.color = color;
        this.storage = storage;
        this.price = price;
    }

    public String brand;
    public String color;
    public int storage;
    public double price;

    public abstract void call();
    public abstract void text();
    public abstract void ring();

    //Create a method that prints info of the phone -> printInfo []
    public void printInfo(){
        System.out.println("[" +
                "brand: " + brand +
                ", color: " + color +
                ", storage: " + storage +
                ", price: " + price +
                "]");
    }
}
