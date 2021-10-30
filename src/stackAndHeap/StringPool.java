package stackAndHeap;

public class StringPool {
    public static void main(String[] args) {
        String name1 = "Lionel"; // location in the heap-pool
        String name2 = "Lionel"; // location in the heap-pool

        System.out.println(name1 == name2); // true ->



        /*
        When we create a String without new keyword
        First, it checks the pool to see if we have the value in the pool
            -If we have the value in the pool, then Java does not create a new String value in the pool
            and it uses the existing value
            -If the value is not found in the pool, then a new String value is created in the pool
         */


        String address1 = new String("Chicago");
        String address2 = new String("Chicago");

        System.out.println(address1.equals(address2)); // true

        address1 = null;

        System.out.println(address1);

    }
}
