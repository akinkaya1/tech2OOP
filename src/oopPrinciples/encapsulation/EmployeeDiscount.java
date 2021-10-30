package oopPrinciples.encapsulation;

import java.util.Scanner;

public class EmployeeDiscount {
    public static void main(String[] args) {
        /*
        Write a program that asks an employee to enter their information age, gender and fullName

        Test Data:
        fullName = Julia Smith
        age = 25
        gender = female

        Print "{fullName} has $50 discount" if user is over 15 and female
        Print "{fullName} has $25 discount" if user is over 15 and male
        Print "NO DISCOUNT" if user is under 15 or 15

        EXPECTED OUTPUT:
        Julia Smith has $50 discount
         */
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("Please enter your full name");
        emp.setFullName(scanner.nextLine());

        System.out.println("Please enter your age");
        emp.setAge(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Please enter your gender");
        emp.setGender(scanner.nextLine());

        if(emp.getAge() <= 15){
            System.out.println("NO DISCOUNT");
        }
        else if(emp.getGender().equalsIgnoreCase("male")){
            System.out.println(emp.getFullName() + " has $25 discount");
        }
        else{
            System.out.println(emp.getFullName() + " has $50 discount");
        }

    }
}
