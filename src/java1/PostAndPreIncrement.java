package java1;

public class PostAndPreIncrement {

    public static void main(String[] args) {

        int i = 1;

        // i++; - first assign value then increment
        // ++i; - first increment then assign value

     //   System.out.println(++i);
     //   System.out.println(i);

         i = i++;

         /* logic
         temp = i;
         i++;
         i=temp;*/

        System.out.println(i);

    }
}
