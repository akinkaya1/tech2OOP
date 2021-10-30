package oopPrinciples.encapsulation;

public class Employee {
    //default constructor
    public Employee(){

    }


    //Instance variables
    private final static int totalNumberOfEmployees = 4;

    private String fullName;
    private String gender;
    private int age;
    private String phoneNumber;
    private String address;

    //Encapsulate fullName, gender, age, phoneNumber and address instance variables
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
