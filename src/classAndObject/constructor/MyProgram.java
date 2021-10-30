package classAndObject.constructor;

public class MyProgram {
    public static void main(String[] args) {
        /*
        Create a Dog object and define all its information
        Peanut
        Collie
        1
        Brown
        Male
        Big
         */




        Dog dog2 = new Dog("Blue", 2);

        System.out.println(dog2.name); // Blue
        System.out.println(dog2.age); // 2


        Dog dog3 = new Dog("Tom", "Collie", 3, "Pink", "Male", "Small");
        System.out.println(dog3.dogToString());

        //
        Dog volDog = new Dog();
        volDog.name = "Peanut";
        volDog.breed = "Collie";
        volDog.age = 1;
        volDog.color = "Brown";
        volDog.gender = "Male";
        volDog.size = "Big";

        System.out.println(volDog.dogToString());





        volDog.eat();
        volDog.bark();
        volDog.run();





    }
}
