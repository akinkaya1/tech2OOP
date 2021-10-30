package oopPrinciples.polymorphism;

public class Collie extends Dog{
    @Override
    public void eat() {
        System.out.println("Collie eats");
    }

    @Override
    public void sleep() {
        System.out.println("Collie sleeps");
    }
}
