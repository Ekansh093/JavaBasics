package programs;

public class IntegerSwapping {

    public static void main(String[] args) {

        int x= 10, y=5;

        //1. using third variable
//        int temp = x;
//        x=y;
//        y= temp;

        //2. +
//        x = x+y;
//        y=x-y;
//        x=x-y;

        //3. *
//        x = x*y;
//        y=x/y;
//        x=x/y;

        //4. XOR
        // 10 - 1010
        //5 - 0101
        //1111
        x = x^y;
        y= x^y;
        x= x^y;

        System.out.println(x);
        System.out.println(y);
    }
}
