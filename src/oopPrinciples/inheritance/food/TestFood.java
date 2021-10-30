package oopPrinciples.inheritance.food;

public class TestFood {
    public static void main(String[] args) {
        Food f1 = new Food();
        f1.name = "Salad"; // direct access to set
        System.out.println(f1.name); // direct access to get

        f1.setTaste("Delicious"); // indirect access to set
        System.out.println(f1.getTaste()); // indirect access to get

        f1.setSpicy(false);

        Vegetable vegetable1 = new Vegetable();
        vegetable1.name = "Cucumber";
        vegetable1.setColor("Green");

        System.out.println(vegetable1.getColor());

        f1.printInfo();
        vegetable1.printInfo();
    }
}
