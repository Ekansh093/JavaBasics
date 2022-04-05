package java1;

public class BitwiseAndOR {

    public static void main(String[] args) {

        int a = 25; // 1 1 0 0 1
        int b = 15; // 0 1 1 1 1
        // AND         0 1 0 0 1
        //OR           1 1 1 1 1

        int c = a & b; //bitwise AND
        System.out.println(c);

        c = a | b; // bitwise OR
        System.out.println(c);

    }
}
