package oopPrinciples.abstraction.practiceAbstractClass;

import java.util.ArrayList;
import java.util.List;

public class C {
    /*
    extend class C to B and implement all the methods
     */

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Akin");
        names.add("Murat");

        List<String> names2 = new ArrayList<>(names);

        System.out.println(names2);

        System.out.println(names.equals(names2));
    }
}
