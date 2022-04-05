package programs;

public class IntegerCaching {

    public static void main(String[] args) {

        /**
         * integer caching happens from -128 to 127.
         *
         * In Java 5, a new feature was introduced to save the memory and improve performance for Integer
         * type objects handling. Integer objects are cached internally and reused via the same referenced objects.
         *
         * This is applicable for Integer values in the range between –128 to +127.
         * This Integer caching works only on auto-boxing. Integer objects will not be cached when they are built
         * using the constructor.
         */

        Integer i1 = 130;
        Integer i2 = 130;

      //  Integer i1 = 100;
      //  Integer i2 = 100;

        if (i1 == i2)
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }
}
