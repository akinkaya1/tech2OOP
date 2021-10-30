package oopPrinciples.inheritance;

public class UnderstandingInheritance {
    public static void main(String[] args) {
        Human human1 =  new Human();
        human1.name = "Lionel";
        human1.setDateOfBirth("11/11/1995");

        System.out.println(human1.name);
        System.out.println(human1.getDateOfBirth());
        human1.eat();

        Programmer programmer1 = new Programmer();
        programmer1.name = "Raqi";

        System.out.println(programmer1.name);

        programmer1.learn();
        System.out.println(programmer1.getClass());
    }
}
