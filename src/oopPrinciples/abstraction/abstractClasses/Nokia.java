package oopPrinciples.abstraction.abstractClasses;

public class Nokia extends Phone implements BlueTooth {
    //Extend it to Phone and implement bodies
    private final String OS = "Android";

    public String getOS() {
        return OS;
    }

    //Create 4 args constructor that chains Phone constructor
    public Nokia(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    @Override
    public void call() {
        System.out.println("Nokia is calling");
    }

    @Override
    public void text() {
        System.out.println("Nokia is texting");
    }

    @Override
    public void ring() {
        System.out.println("Nokia is ringing");
    }

    @Override
    public void connectBlueTooth() {
        System.out.println("Nokia connects to BlueTooth");
    }
}
