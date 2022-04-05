package programs;

public class RemoveSpecialChar {

    public static void main(String[] args) {

        String str = "&*(&(*!$HSN*&(*&(*AKE)(*)+_)+)_)+$##~";
        str = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
    }
}
