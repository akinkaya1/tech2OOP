package oopPrinciples.encapsulation;

public class CompanyTest {
    public static void main(String[] args) {
        /*
        Create a company1 object
        set all of its information

        Create a company2 object
        set all of its information

        Print info for both company objects
        Print which company has more employees with message "{company} has more employee"
        If both companies have same number of employees then print "Both companies have same number of employees"
         */

        Company company1 = new Company();
        company1.setName("Apple");
        company1.setTotalNumberOfEmployees(1500);
        company1.setAddress("California");
        company1.setPhoneNumber("(123) 234-1234");

        Company company2 = new Company();
        company2.setName("Expedia");
        company2.setTotalNumberOfEmployees(1500);
        company2.setAddress("Chicago");
        company2.setPhoneNumber("(312) 123-1234");

        company1.printInfo();
        company2.printInfo();

        if(company1.getTotalNumberOfEmployees() > company2.getTotalNumberOfEmployees()){
            System.out.println(company1.getName() + " has more employees");
        }
        else if(company1.getTotalNumberOfEmployees() < company2.getTotalNumberOfEmployees()){
            System.out.println(company2.getName() + " has more employees");
        }
        else{
            System.out.println("Both companies has same number of employees");
        }

    }
}
