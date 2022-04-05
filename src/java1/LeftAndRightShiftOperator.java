package java1;

public class LeftAndRightShiftOperator {

    public static void main(String[] args) {

        int a = 8; // 1 0 0 0

        int b = a << 2; // left shift - 32
        System.out.println(b);

        b = a >> 2; // right shift - 2
        System.out.println(b);
    }
}
