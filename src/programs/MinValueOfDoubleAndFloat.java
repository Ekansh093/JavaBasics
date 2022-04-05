package programs;

public class MinValueOfDoubleAndFloat {

    public static void main(String[] args) {
        // min value of double and float is -ve.
        System.out.println(Double.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        System.out.println(Math.min(Float.MIN_VALUE, 0.0f));
        System.out.println(Math.min(Integer.MIN_VALUE, 0));
        System.out.println(Math.min(Float.MIN_VALUE, Float.NEGATIVE_INFINITY));
    }
}
