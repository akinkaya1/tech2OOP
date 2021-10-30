package oopPrinciples.abstraction.abstractClasses;

public class IPhone extends Phone implements Camera, BlueTooth {
    //Extend it to Phone and implement bodies

    private final String OS = "Apple OS";
    public String getOS() {
        return OS;
    }
    public IPhone (String brand, String color, int storage, double price){
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
        System.out.println(brand + " is ringing");
    }

    @Override
    public void takesPhoto() {
        System.out.println("iPhone takes photo");
    }

    @Override
    public void connectBlueTooth() {
        System.out.println("iPhone connects to BlueTooth");
    }
}
