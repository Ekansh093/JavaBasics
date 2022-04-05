package programs;

public class ReverseInteger {

    public static void main(String[] args) {

        int i = 123456789;
        int finalNum = 0;
        while (i>0){
            finalNum = finalNum * 10 + i % 10;
            i = i/10;
        }
        System.out.println(finalNum);

        int j = 123456789;
        StringBuffer sb = new StringBuffer(String.valueOf(j));
        System.out.println(sb.reverse());

    }

}
