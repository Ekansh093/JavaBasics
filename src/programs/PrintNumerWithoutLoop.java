package programs;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintNumerWithoutLoop {

    //with recursion

    /*public static void main(String[] args) {
        printNum(1);
    }

    public static void printNum(int i){
        if (i<=100){
            System.out.println(i);
            i++;
            printNum(i);
        }
    }*/

    // without recursion & using Java Stream

    /*public static void main(String[] args) {

        IntStream.range(1, 101).forEach(e -> System.out.println(e));
    }*/

    // without recursion, loop and stream

    public static void main(String[] args) {

    }



}
