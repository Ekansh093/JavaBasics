package programs;

public class StaticBlockWithFinalVar {
    public static void main(String[] args) {
        System.out.println(StaticBlockWithFinalVarTemp.i);
        System.out.println(StaticBlockWithFinalVarTemp.j);
    }
}

class StaticBlockWithFinalVarTemp{

    public static final int i =100;
    public static int j =100;

    static {
        System.out.println("static block");
    }
}