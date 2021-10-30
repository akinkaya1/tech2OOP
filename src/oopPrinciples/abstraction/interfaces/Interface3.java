package oopPrinciples.abstraction.interfaces;

public interface Interface3 extends Interface1, Interface2 {
    public abstract void method3();

    @Override
    default void methodWithBody(){

    }
}
