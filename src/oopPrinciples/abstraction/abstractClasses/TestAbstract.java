package oopPrinciples.abstraction.abstractClasses;

public class TestAbstract {
    public static void main(String[] args) {
        Samsung samsung1 = new Samsung("Samsung", "Black", 64, 700);
        samsung1.printInfo();
        samsung1.call();
        System.out.println(samsung1.getOS());

        /*
        Create a new Nokia object 4 args constructor in the form of Nokia
        Print its info using printInfo() method
        and call getOS(), text() and call() methods
         */

        Nokia nokia1 = new Nokia("Nokia", "Blue", 16, 50);
        nokia1.printInfo();
        System.out.println(nokia1.getOS());
        nokia1.call();
        nokia1.text();

        /*
        Create a new iPhone object 4 args constructor in the form of iPhone
        Print its info using printInfo() method
        and call getOS(), text() and call() methods
         */

        IPhone iPhone1 = new IPhone("Apple", "Blue", 258, 1200);
        iPhone1.printInfo();
        iPhone1.call();
        iPhone1.text();
        iPhone1.ring();
        System.out.println(iPhone1.getOS());
    }
}
