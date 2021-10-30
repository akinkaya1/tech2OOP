package oopPrinciples.polymorphism;

public class Animal {

    public void eat(){
        System.out.println("Animal eats");
    }

    //Overloaded eat method
    public void eat(String str){
        System.out.println("Animal eats " + str);
    }

    public void sleep(){
        System.out.println("Animal sleeps");
    }
}
