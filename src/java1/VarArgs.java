package java1;

public class VarArgs {

    public static void main(String[] args) {
        Display d = new Display();
        d.show(1,2,3,4,5);
        d.show(65);
    }
}

class Display{
    public void show(int ... a){
        for(int i : a){
            System.out.print(i + " ");
        }
    }

    public void show(int a){
        System.out.print(a + "in show");
    }
}