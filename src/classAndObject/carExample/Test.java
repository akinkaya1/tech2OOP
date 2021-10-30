package classAndObject.carExample;

public class Test {
    public static void main(String[] args) {
        /*
        Create a Car object named car1
        NOTE: Car is not a String but
        Some of Car attributes are String
         */
        System.out.println("\n---TASK_1---\n");
        Car car1 = new Car(); //

        //Assigning values to car1 object fields
        car1.make = "BMW";
        car1.model = "X5";
        car1.year = 2021;
        car1.color = "Black";

        //Print and see values assigned to car1 object

        System.out.println(car1); // The location of the object from the memory


        /*
        Create a new Car object called car2
        And assign below information
        Make - Mercedes
        Model - G63
        Year - 2020
        Color - White
        Print all information for car2
         */

        System.out.println("\n---TASK_2---\n");
        Car car2 = new Car();

        car2.make = "Mercedes";
        car2.model = "G63";
        car2.color = "White";
        car2.year = 2020;


         /*
        Create a new Car object called car3
        And assign below information
        Make - Audi
        Model - A7
        Year - 2020
        Color - Gray
        Print all information for car3
         */

        System.out.println("\n---TASK_3---\n");
        Car car3 = new Car();
        car3.make = "Audi";
        car3.model = "A7";
        car3.year = 2020;
        car3.color = "Gray";


        System.out.println("\n---TASK_4---\n");
        //Create an array to store your car objects

        Car[] carsCollection = {car1, car2, car3};


        for(Car car: carsCollection){
                System.out.println(car);// Location for each car object
                System.out.println(car.make);
                System.out.println(car.model);
                System.out.println(car.year);
                System.out.println(car.color);
                System.out.println();
        }

        for (int i = 0; i < carsCollection.length; i++) {
            System.out.println(carsCollection[i].make);
            System.out.println(carsCollection[i].model);
            System.out.println(carsCollection[i].year);
            System.out.println(carsCollection[i].color);
            System.out.println();
        }


    }
}
