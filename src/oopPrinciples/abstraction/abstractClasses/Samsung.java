package oopPrinciples.abstraction.abstractClasses;

public class Samsung extends Phone implements Camera, BlueTooth {

    private final String OS = "Android";

    public String getOS() {
        return OS;
    }

    public Samsung(){
        //default constructor
    }

    public Samsung(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    @Override
    public void call() {
        System.out.println(brand + " is calling");
    }

    @Override
    public void text() {
        System.out.println(brand + " is texting");
    }

    @Override
    public void ring() {
        System.out.println("Samsung is ringing");
    }

    @Override
    public void takesPhoto() {
        System.out.println("Samsung takes photos");
    }

    @Override
    public void connectBlueTooth() {
        System.out.println("Samsung connects to BlueTooth");
    }
}
