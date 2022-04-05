package java1;

import java.util.ArrayList;

public class WrapperClasses {

    public static void main(String[] args) {

        Integer i = new Integer(5); // Boxing

        i =6; // auto boxing - introduced in java 1.5

        int j = i.intValue(); //unboxing

        j = i; // auto unboxing

        // Wrapper classes are used in collections

        ArrayList<Integer> l = new ArrayList();
        l.add(1);

        // we can use wrapper class Integer in for loop but int (primitive data type) works fast

    }
}
