package classAndObject.constructor;

public class Cat {
    /*
    WHAT CAT HAS?
    name
    age
    color
    eyesColor
    gender
    weight
    height
     */

    //Create instance variables
    String name;
    int age;
    String color;
    String eyesColor;
    char gender;
    double weight;
    double height;


    //Create a custom constructor that takes 7 arguments and assign these to instance variables
    public Cat(String name, int age, String color, String eyesColor, char gender, double weight, double height){
        this.name = name;
        this.age = age;
        this.color = color;
        this.eyesColor = eyesColor;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    /*
    WHAT CAT DOES?
    eat()
    scratch()
    makeSounds()
    run()
    sleep()
     */

    public void eat(){
        System.out.println(this.name + " is eating");
    }

    public void scratch() {
        System.out.println(this.name + " is scratching");
    }
    public void makeSounds() {
        System.out.println(this.name + " is making sounds");
    }
    public void run() {
        System.out.println(this.name + " is running");
    }
    public void sleep() {
        System.out.println(this.name + " is sleeping");
    }


    //Create printInfo method that prints all the information of an object
    public void printInfo(){
        System.out.println("[" +
                "name: " + this.name + ", " +
                "age: " + this.age + ", " +
                "color: " + this.color + ", " +
                "eyesColor: " + this.eyesColor + ", " +
                "gender: " + this.gender + ", " +
                "weight: " + this.weight + ", " +
                "height: " + this.height +
                "]");
    }











    public static void main(String[] args) {
        //Create cat1 object with 7 args constructor
        System.out.println("\n---CAT1---\n");
        Cat cat1 = new Cat("Sky", 2, "White", "Blue", 'F', 10.7, 33.3);
        cat1.color = "Black";
        cat1.age = 3;
        cat1.printInfo();

        cat1.run();
        cat1.makeSounds();
        cat1.eat();
        cat1.sleep();
        cat1.scratch();

        System.out.println("\n---CAT2---\n");
        //Create cat2 object with 7 args constructor

        Cat cat2 = new Cat("Smoky", 1, "Gray", "Blue", 'F', 11.7, 32.3);
        cat2.printInfo();
        cat2.eat();
        cat2.makeSounds();
        cat2.run();
        cat2.scratch();
        cat2.sleep();
    }
}
