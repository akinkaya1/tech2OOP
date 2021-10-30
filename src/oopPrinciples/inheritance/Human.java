package oopPrinciples.inheritance;

public class Human {

    //default constructor
    public Human(){

    }

    //Instance variables
    public String name;
    protected int age;
    protected String gender;
    private String dateOfBirth;
    protected String birthCountry;
    double height;
    double weight;


    //Encapsulate dateOfBirth
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    //behaviors
    public void learn(){
        System.out.println("Human is learning");
    }

    public final void eat(){
        System.out.println("Human is eating");
    }

    public void walk(){
        System.out.println("Human is walking");
    }

    public void sleep(){
        System.out.println("Human is sleeping");
    }

}
