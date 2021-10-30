package stackAndHeap;

import classAndObject.constructor.Cat;
import classAndObject.constructor.Dog;

public class DataTypes {
    public static void main(String[] args) {

        //Primitives and reference types

        int age;
        age = 45;

        Dog dog1 = new Dog();
        dog1.name = "Peanut";
        dog1.age = 3;
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        System.out.println(age);
        System.out.println(dog1); // Dog@4617c264
        System.out.println(dog2); // Dog@36baf30c


        System.out.println(dog1.name); // Peanut
    }
}
