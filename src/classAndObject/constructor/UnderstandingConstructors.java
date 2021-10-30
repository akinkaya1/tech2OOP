package classAndObject.constructor;

public class UnderstandingConstructors {
    public static void main(String[] args) {
        /*
        Create a dog object with non-args constructor (default)
        and assign all values to the object
         */

        Dog myDog1 = new Dog(); // default constructor
        myDog1.name = "Boomer";
        myDog1.breed = "German Shepherd";
        myDog1.age = 10;
        myDog1.color = "White";
        myDog1.gender = "Male";
        myDog1.size = "Huge";

        /*
        Create a new dog object with 6 argument constructor
         */

        Dog myDog2 = new Dog("Tommy", "Puppy", 1, "Yellow", "Male", "Small");

        Dog myDog3 = new Dog("XXX", 3, "Puppy", "Male");

        System.out.println(myDog3.breed);
        System.out.println(myDog3.gender);

    }
}
