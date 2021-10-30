package stackAndHeap;

import classAndObject.constructor.Dog;

public class GarbageCollection {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        System.out.println("Location of dog 1 = " + dog1);
        System.out.println("Location of dog 2 = " + dog2);

        dog1 = dog2;

        System.gc();
        Runtime.getRuntime().gc();

        System.out.println("\n---After reassignment---\n");
        System.out.println("Location of dog 1 = " + dog1);
        System.out.println("Location of dog 2 = " + dog2);
    }
}
