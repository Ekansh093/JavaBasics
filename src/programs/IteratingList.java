package programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratingList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        // 1. using for loop
        // 2. using for each loop
        //3. using iterator

        //4. using for each and lambda expression

        list.forEach(num ->{
            System.out.println(num);
        });

        System.out.println("===========");

        // 5. using forEachRemaining
        Iterator itr = list.iterator();
        itr.forEachRemaining(num -> {
            System.out.println(num);
        });

        System.out.println("===========");

        //6. using listIterator
        ListIterator listItr = list.listIterator(list.size());
        while (listItr.hasPrevious()){
            System.out.println(listItr.previous());
        }
    }
}
