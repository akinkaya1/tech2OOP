package oopPrinciples.abstraction.interfaces;

public interface Interface1 {
    //abstract method
    public abstract void method1();

    //default method
    public default void methodWithBody(){

    }

    //static method
    public static void methodWithBody(int i){

    }
}
