package classAndObject.fruitExample;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*
        Create 4 Fruit objects
        Define information below for each object
        Fruit1 : banana
                 yellow
                 moon shape
                 true

        Fruit2 : apple
                 red
                 sphere
                 true

        Fruit3 : avocado
                 green
                 oval
                 false

        Fruit4: orange
                orange
                sphere
                true


        Print all the info for each fruit object above
         */
        Fruit fruit1 = new Fruit();

        fruit1.name = "banana";
        fruit1.color = "yellow";
        fruit1.shape = "moon shape";
        fruit1.isSweet = true;
        fruit1.isRollable = false;


        Fruit fruit2 = new Fruit();
        fruit2.name = "apple";
        fruit2.color = "red";
        fruit2.shape = "sphere";
        fruit2.isSweet = true;



        Fruit fruit3 = new Fruit(); //
        fruit3.name = "avocado";
        fruit3.color = "green";
        fruit3.shape = "oval";
        fruit3.isSweet = false;


        Fruit fruit4 = new Fruit(); //
        fruit4.name = "orange";
        fruit4.color = "orange";
        fruit4.shape = "sphere";
        fruit4.isSweet = true;

        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(fruit1);
        fruitList.add(fruit2);
        fruitList.add(fruit3);
        fruitList.add(fruit4);

        int count = 1;
        for(Fruit element: fruitList){
            System.out.println("Information of fruit " + count++);
            //create a method that prints all info of fruit
            element.printInfo();
            System.out.println(Fruit.toString(element));
            System.out.println();
        }
    }
}
