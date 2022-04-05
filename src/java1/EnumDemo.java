package java1;

public class EnumDemo {

    public static void main(String[] args) {
        System.out.println(Mobile.REDMI.hashCode() == 209813603);
        System.out.println(Mobile.SAMSUNG.hashCode());
        System.out.println(Mobile.NOKIA.hashCode());

        System.out.println("REDMI".toLowerCase().hashCode());
        Mobile.SAMSUNG.setPrice(300);
        System.out.println(Mobile.SAMSUNG.getPrice());
    }
}

enum Mobile{

    REDMI(80),
    SAMSUNG,
    NOKIA(100);

    private int price;

    Mobile(int price){
        this.price = price;
    }

    Mobile(){}

    void setPrice(int price){
        this.price = price;
    }

    int getPrice(){
        return this.price;
    }

}