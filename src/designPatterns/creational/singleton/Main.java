package designPatterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        SingletonObject obj1 = SingletonObject.getInstance();
        SingletonObject obj2 = SingletonObject.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
