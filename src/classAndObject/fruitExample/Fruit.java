package classAndObject.fruitExample;

public class Fruit {

    //Define attributes of Fruit
    static final boolean hasColor = true;
    String name; // null
    String color;
    String shape;
    boolean isSweet;
    boolean isRollable = true;

    public void printInfo(){
        System.out.println("Fruit name is = " + name);
        System.out.println(name + " color is = " + color);
        System.out.println(name + " shape is = " + shape);
        System.out.println(name + " isSweet is = " + isSweet);
        System.out.println(name + " isRollable is = " + isRollable);
        System.out.println(name + " has color is = " + hasColor);
    }


    /*
    Create toString method for Fruit class
    static
    takes 1 arg that is Fruit object
    returns all information of given object as a String

    [Key: Value, Key: Value, ....]
     */

    public static String toString(Fruit fruit){
        return "[" +
                "Name: " + fruit.name + ", " +
                "Color: " + fruit.color + ", " +
                "Shape: " + fruit.shape + ", " +
                "isSweet: " + fruit.isSweet + ", " +
                "isRollable: " + fruit.isRollable + ", " +
                "hasColor: " + hasColor +
                "]";
    }
}
