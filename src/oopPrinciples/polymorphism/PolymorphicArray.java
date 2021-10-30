package oopPrinciples.polymorphism;

public class PolymorphicArray {
    public static void main(String[] args) {
        Collie collie = new Collie();
        Dog dog = new Dog();
        Animal animal = new Animal();

        String[] names = {"Volkan", "Maryna", "Yasser"};

        Object[] objects = {collie, dog, animal};
        Animal[] animals = {collie, dog, animal};

        for(Animal a: animals){
            System.out.println(a.getClass());
            a.eat();
            a.sleep();
            System.out.println("\n----------------------\n");
        }
    }
}
