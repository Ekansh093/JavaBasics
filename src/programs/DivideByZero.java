package programs;

public class DivideByZero {

    public static void main(String[] args) {

        // float and double numbers will return Infinity
        // integer will five arithmetic exception

        System.out.println(1.1/0);
        System.out.println(1.3f/0);
        System.out.println(0.0/0);
        System.out.println(0.0/0.0);
        System.out.println(1.23d/0.0);
      //  System.out.println(1/0);
    }
}
