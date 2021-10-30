package oopPrinciples.encapsulation;

import java.util.Scanner;

public class EmployeeClubTask {
    public static void main(String[] args) {
        /*
        Write a program that asks an employee to enter their information age, address and fullName

        Test Data:
        fullName = Alex Robert
        address = 1234 Abc St, Chicago IL 12345
        age = 32

        Print "{fullName} is in the club" if user is from Chicago and age is more than 21
        Print "{fullName} is not in the club" otherwise

        EXPECTED OUTPUT:
        Alex Robert is in the club
         */

        Scanner scanner = new Scanner(System.in);
        Employee emp1 = new Employee();

        System.out.println("Please enter your full name");
        emp1.setFullName(scanner.nextLine());

        System.out.println("Please enter your age");
        emp1.setAge(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Please enter your address");
        emp1.setAddress(scanner.nextLine());

        if(emp1.getAddress().toLowerCase().contains("chicago") && emp1.getAge() > 21){
            System.out.println(emp1.getFullName() + " is in the club");
        }
        else{
            System.out.println(emp1.getFullName() + " is not in the club");
        }
    }
}
