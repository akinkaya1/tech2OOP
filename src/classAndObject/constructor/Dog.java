package classAndObject.constructor;

public class Dog {

    public Dog(){
        //default constructor
    }

    //Create a constructor that creates object with name and age
    public Dog(String name, int age){
        //Assign those local variables into instance variables
        System.out.println("Constructor with 2 args");
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, String breed, String gender){
        //Assign those local variables into instance variables
        this(name, age);
        System.out.println("Constructor with 4 args");
        this.breed = breed;
        this.gender = gender;
    }

    //Create a constructor that creates object with all information needed
    public Dog(String name, String breed, int age, String color, String gender, String size){
        this(name, age, breed, gender);
        System.out.println("Constructor with 6 args");
        this.color = color;
        this.size = size;
    }



    /*
    instance variables -> Define what your Dog objects will have
    name
    breed
    age
    color
    gender
    size
     */


    public String name;
    String breed;
    public int age;
    String color;
    String gender;
    String size;

    /*
    behaviors -> Define what your Dog objects will do
    bark()
    eat()
    run()
     */

    public void bark(){
        System.out.println(name + " barks.");
    }

    public void eat(){
        System.out.println(name + " eats food.");
    }

    public void run(){
        System.out.println(name + " runs around.");
    }

    public String dogToString(){
        return "[" +
                "name: " + name + ", " +
                "breed: " + breed + ", " +
                "age: " + age + ", " +
                "color: " + color + ", " +
                "gender: " + gender + ", " +
                "size: " + size +
                "]";
    }

    public void finalize(){
        System.out.println("Garbage collector was here to clear " + this);
    }
}
