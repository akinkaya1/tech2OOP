package oopPrinciples.encapsulation;

public class Company {
    /*
    create instance variables below
    name
    totalNumberOfEmployees
    address
    phoneNumber
     */

    private String name;
    private int totalNumberOfEmployees;
    private String address;
    private String phoneNumber;

    //Encapsulate them

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTotalNumberOfEmployees(int totalNumberOfEmployees) {
        this.totalNumberOfEmployees = totalNumberOfEmployees;
    }

    public int getTotalNumberOfEmployees() {
        return totalNumberOfEmployees;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Write a method printInfo() that prints all the info for the company object []
    public void printInfo(){
        System.out.println("[" +
                            "name: " + name + ", " +
                            "totalNumberOfEmployees: " + totalNumberOfEmployees + ", " +
                            "address: " + address + ", " +
                            "phoneNumber: " + phoneNumber +
                            "]");
    }
}
