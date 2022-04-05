package programs;

public class StringContainsDigits {

    public static boolean isEmpty(CharSequence cs){
        return cs == null || cs.length() == 0;
    }

    public static boolean isDigit(CharSequence cs){
        if(isEmpty(cs)) return false;

        for(int i=0; i<cs.length(); i++){
            if(!Character.isDigit(cs.charAt(i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isDigit(null));
        System.out.println(isDigit(""));
        System.out.println(isDigit("qweqweq"));
        System.out.println(isDigit("12312"));
        System.out.println(isDigit("qe12qweq"));
        System.out.println(isDigit("(&(*&(qwe12"));

        System.out.println(isDigit("\u0967"));
    }
}
