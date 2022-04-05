package programs;

public class PrintWithLAndWithoutL {

    public static void main(String[] args) {
        long i = 365*365*67*1000;
        System.out.println(i);
        // 8926075000
        // 1000010100000010010001100001111000

        // without using L, the number will be treated as integer by java, so the first 32 bits will be counted.
        i = 365*365*67*1000L;
        System.out.println(i);
    }
}
