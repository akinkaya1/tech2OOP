package mutableImmutable;

public class StringBuilderExample {
    public static void main(String[] args) {

        String greeting = "Hello";
        greeting = "Hello!";

        System.out.println(greeting);

        //StringBuilder use
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("!");
        sb.append("2763452374"); // Hello!2763452374

        sb = new StringBuilder("Good evening!");
        sb.deleteCharAt(0);
        sb.delete(2, 8);
        sb.delete(0, 6);
        sb.append(12345);
        sb.insert(3, "Salih");

        System.out.println(sb);




        String address = "Chicago";
        address.substring(3); // cago

        //How to convert a String to StringBuilder
        StringBuilder sbAddress = new StringBuilder(address);
        sbAddress.delete(0, 3);
        System.out.println(sbAddress);


        //How to convert StringBuilder to String
        String newStr = sb.toString();





    }
}
