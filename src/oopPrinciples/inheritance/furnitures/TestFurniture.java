package oopPrinciples.inheritance.furnitures;

public class TestFurniture {
    public static void main(String[] args) {
        System.out.println("\nFirst furniture object created\n");
        Furniture furniture1 = new Furniture();
        furniture1.printInfo();

        System.out.println("\nSecond furniture object created\n");
        Furniture furniture2 = new Furniture("Air frier");
        furniture2.printInfo();

        System.out.println("\nThird furniture object created\n");
        Furniture furniture3 = new Furniture("Bed frame", "wood");
        furniture3.printInfo();

        System.out.println("\nFirst table object created\n");
        Table table1 = new Table();
        table1.printInfo();

        System.out.println("\nSecond table object created\n");
        Table table2 = new Table("Ikea");
        table2.printInfo();

        System.out.println("\nThird table object created\n");
        Table table3 = new Table("Ikea", "Metal");
        table3.printInfo();
    }
}
