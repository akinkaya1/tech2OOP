package methods;

public class StringExtension {

    /*
    Create a method that takes a String and returns it back reversed
    public static

    public static String reverseString(String s){
       //write your code to reverse String
    }
     */


    public static String reverseString(String s){
        return new StringBuilder(s).reverse().toString();
    }


    /*
    Create a method that takes a String and returns a boolean
    isPalindrome
    this method will return true if given String reads same bacward
    it returns false otherwise

    civic -> true
    Civic -> false
    abcde -> false
     */

    public static boolean isPalindrome(String s){
        return reverseString(s).equals(s);
    }




    public static void main(String[] args) {
        System.out.println(StringExtension.reverseString("12345"));
        System.out.println(StringExtension.isPalindrome(""));
    }

}
