package methods;

public class MathHelper {
    /*
    Create a method called sumOf2 that takes 2 int variables and returns sum of them
    -public static
     */

    public static int sumOf2(int a, int b){
        return a + b;
    }

    /*
    Create a method called randomNumberGenerator
    that generates random numbers bt 2 int variables given as arguments
    -both arguments will be included
     */

    public static int randomNumberGenerator(int begin, int end){
        return begin + (int)(Math.random() * (end - begin + 1)); // 0-1
    }


    /*
    Create a method called closestTo10 that takes 2 int variables and return which ever is close to
    -public static
    -7 and 20 -> 7
    --20 and 99 -> -20
    - 5 and 6 -> 6
    -Assume numbers are different from each other and their distance from 10 is also different
     */

    public static int closestTo10(int a, int b){
        if(Math.abs(a-10) > Math.abs(b-10)) return b;
        return a;
    }







    public static void main(String[] args) {
        int sum = MathHelper.sumOf2(5, 10);
        System.out.println(sum);

        System.out.println(MathHelper.randomNumberGenerator(21, 22)); // 21, 22
        System.out.println(MathHelper.closestTo10(100, 5));

    }
}
