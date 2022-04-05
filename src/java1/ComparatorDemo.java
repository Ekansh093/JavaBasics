package java1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(334);
        list.add(551);
        list.add(900);
        list.add(786);
        list.add(102);

     //   Collections.sort(list);

        // sorting based on unit digit

     //   Comparator<Integer> comp = new CompImp();

        Collections.sort(list, (o1, o2) -> {
            return o1%10 > o2%10 ? 1 : -1;
        });

        for (Integer i : list){
            System.out.println(i);
        }

        System.out.println("===============");
        List<JavaComparable> list1 = new ArrayList<>();
        list1.add(new JavaComparable(1));
        list1.add(new JavaComparable(3));
        list1.add(new JavaComparable(4));
        list1.add(new JavaComparable(2));
        Collections.sort(list1);
        for (JavaComparable j : list1){
            System.out.println(j.getI());
        }
    }
}

class CompImp implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1%10 > o2%10)
            return 1;
        return -1;
    }
}

class JavaComparable implements Comparable<JavaComparable> {
    private int i;

    JavaComparable(int i){
        this.i = i;
    }

    public int getI() {
        return i;
    }

    @Override
    public int compareTo(JavaComparable obj) {
        return this.i > obj.i ? 1 : -1;
    }
}