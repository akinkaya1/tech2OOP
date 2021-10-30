package methods;

public class Printer {
    /*
     Create a method called printName that takes a name as an argument
     and prints Hello + name
     -method should be public static

     EXAMPLE:
     Maryna
     Hello Maryna
     */

    public static void printHelloName(String name){
        System.out.println("Hello " + name);
    }

    /*
    Write a method called printFirst3 that prints first 3 letters of given String
    -It takes a String as an argument
    -It is public and static
    -it is a void

    -if the length of given String is less than 3, print message "There is no 3 characters in this String"

    EXAMPLE 1
    Test data:
    ab

    Expected output:
    There is no 3 characters in this String

    EXAMPLE 2
    Test data:
    Volkan

    Expected output:
    Vol
     */


    public static void printFirst3(String word){
        if(word.length() < 3) System.out.println("There is no 3 characters in this String");
        else System.out.println(word.substring(0, 3)); // 0, 1 ,2
    }

    /*
    Create a method called maxOf3 that takes 3 int values and returns the greatest number
    -it is a return type method
    -it is public static
     */

    public static int maxOf3(int a, int b, int c){
        /*
        if(a > b && a > c) return a;
        else if(b > a && b > c) return b;
        return c;
         */
        return Math.max(Math.max(a, b), c);
    }



    public static void main(String[] args) {
        Printer.printHelloName("Maryna");

        Printer.printFirst3("a");
        Printer.printFirst3("Volkan");

        System.out.println(Printer.maxOf3(10, 13, 8));

        int greatest = Printer.maxOf3(-5, 10, 99);

        System.out.println(greatest);
    }
}
