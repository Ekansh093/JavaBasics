package programs;

public class StringReverse {

    public static void main(String[] args){

        // no reverse finction is available for string bcoz they are immutable
        String name = "HSNAKE";

        int len = name.length();
        String finalN= "";

        for(int i =len-1; i>=0; i--){
            finalN = finalN + name.charAt(i);
        }

        System.out.println(finalN);

        // StringBuffer is mutable and reverse fxn is available
        StringBuffer sb = new StringBuffer(name);
        System.out.println(sb.reverse());
    }
}
