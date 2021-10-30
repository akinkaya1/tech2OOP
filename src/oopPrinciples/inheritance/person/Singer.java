package oopPrinciples.inheritance.person;
import oopPrinciples.inheritance.Human;

public class Singer extends Human {

    @Override
    public void learn() {
        System.out.println("Singer is learning");
    }

    @Override
    public void walk() {
        System.out.println("Singer is walking");
    }

    @Override
    public void sleep() {
        System.out.println("Singer is sleeping");
    }

    public void singing(){
        System.out.println("Singer is singing");
    }

    public void playGuitar(){
        System.out.println("Singer is playing guitar");
    }

    @Override
    protected void finalize() {
        System.out.println("Singer object is garbage collected");
    }


}
