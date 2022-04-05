package java1;

public class StringBfr {

    public static void main(String[] args) {

        // StringBuffer is used to achieve string mutability

        StringBuffer sb = new StringBuffer("Ekansh");
        System.out.println(sb);

        // StringBuffer is thread safe
        // StringBuilder is not thread safe, there is no guarantee of synchronisation
        // should use string buffer

    }
}
