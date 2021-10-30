package oopPrinciples.polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat(); // compile-time polymorphism
        animal1.eat("meat");

        System.out.println("\n-----------------\n");
        Dog dog1 = new Dog();
        dog1.eat(); // Dog eats
        dog1.sleep(); // Dog sleeps
        dog1.bark(); // Dog barks

        System.out.println("\n------up-casting-----------\n");

        //Up-casting
        Animal animal2 = new Dog(); // Object is Dog and reference is Animal
        animal2.eat(); // Dog eats // runtime polymorphism


        System.out.println("\n------proper down-casting-----------\n");
        Animal animal3 = new Dog(); // up-casting from Dog to Animal
        Dog dog3 = (Dog) animal3; // down-casting from Animal to Dog
        dog3.eat(); // Dog eats
        animal3.eat(); // Dog eats


        System.out.println("\n------improper down-casting-----------\n");
        Dog dog2 = (Dog) new Animal();
        dog2.eat();
    }
}
