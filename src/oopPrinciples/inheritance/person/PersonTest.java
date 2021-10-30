package oopPrinciples.inheritance.person;

import oopPrinciples.inheritance.Human;

public class PersonTest {
    public static void main(String[] args) {
        Singer singer1 = new Singer();
        Human human1 = new Human();

        //human1.sleep(); // Human is sleeping
        singer1.sleep(); // Human is sleeping - Singer is sleeping

        human1.walk(); // Human is walking
        singer1.walk(); // Human is walking
        singer1.singing();
        singer1.playGuitar();

        Singer singer2 = new Singer();
        singer2 = singer1;
        System.gc(); //

    }
}
