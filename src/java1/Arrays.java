package java1;

import java.util.Random;

public class Arrays {

    // Arrays are object in java.
    // fixed length

    public static void main(String[] args) {

        int[] a = new int[5];
        Random r = new Random();

        for(int i =0; i< a.length; i++){
          //  a[i] = i + 1;
            a[i] = r.nextInt(10);
        }

        System.out.println(a); // print the hash code of a

        // enhanced for loop
        for(int i : a){
            System.out.println(i);
        }

        // 2D- Arrays

        int[] p = {1,2,3};
        int[] q = {4,5,6};

        int[][] x = {p,q};

        for(int[] i : x){

            for(int j: i){
                System.out.print(j + "");
            }
            System.out.println();
        }

    }
}
