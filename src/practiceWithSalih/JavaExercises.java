package practiceWithSalih;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaExercises {
    public static void main(String[] args) {

        /*
        int[] numbers = { 4, 6, 12, 14,  77, 23, 2, 5}
        Write four methods that is gonna take one int array
        as parameter and finds and returns the following
        1. Find max
        2. Find min  --> getMinInArray
        3. Find second max
        4. Find second min
         */

        int[] numbers = {4, 6, 12, 14, 77, 23, 2, 5};

        /*
        Create a method that is going to return the wanted length
        fibonacci sequence. It should take length as a parameter
        and returns as List.
         */

        System.out.println(getFibonacciSequence(10));

        /*
        Create a method that is going to return the wanted length
        fibonacci sequence. It should take length as a parameter
        and returns as List<Integer> and you cannot use any variables
        other than the List.
         */

        JavaExercises thisClass = new JavaExercises();

        System.out.println(thisClass.getFibonacciAsList(10));

    }

    /*
    1. What do you need (container)
    2. Decide whatever you gonna use (conditions and loops)
    3. Fill the spaces
     */

    public List<Integer> getFibonacciAsList(int length){

        //0 1 1 2 3 5 8 13 21 34
        List<Integer> fibo = new ArrayList<>(); //0 1 1

        fibo.add(0);
        fibo.add(1);
                        //length = 10
        for (int i = 0; i < length; i++) { // 10 iteration

            fibo.add(fibo.get(i) + fibo.get(i + 1));  // i = 0, size = 3 ; i = 1, size = 4;....i = 9, size = 12

        }

        return fibo;
    }



    public static String getFibonacciSequence(int l){
        String fibo = "";

        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < l; i++) {

            if (!(l - 1 == i)){
                fibo += num1 + ", ";
            } else fibo += num1 + "";

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;


        }

        return fibo;
    }






    public static int getMaxInArray(int[] numbers){
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) max = number;
        }
        return max;
    }

    public static int getMinInArray(int[] numbers){
        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < min) min = number;
        }
        return min;
    }

    public static int getSecondMinInArray(int[] numbers){
        int secondMin = Integer.MAX_VALUE;

        for (int number: numbers) {
            if (number < secondMin && number != getMinInArray(numbers))
                secondMin = number;
        }

        return secondMin;
    }

    public static int getSecondMaxInArray(int[] numbers){
        int secondMax = Integer.MIN_VALUE;

        for (int number: numbers) {
            if (number > secondMax && number != getMaxInArray(numbers))
                secondMax = number;
        }

        return secondMax;
    }
}
