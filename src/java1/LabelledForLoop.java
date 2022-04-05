package java1;

public class LabelledForLoop {

    public static void main(String[] args) {

        ekansh:
        for(int i=0; i<4; i++){

            System.out.print("*");

            if(i==2) break ekansh;

            for(int j=0; j<4; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
