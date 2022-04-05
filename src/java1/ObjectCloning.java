package java1;

public class ObjectCloning implements Cloneable {

    public static void main(String[] args) throws CloneNotSupportedException {

        ObjectCloning obj1 = new ObjectCloning();
        ObjectCloning obj2 = obj1;

        System.out.println(obj1);
        System.out.println(obj2);

        ObjectCloning obj3 = (ObjectCloning) obj1.clone();
        System.out.println(obj3);
    }
}
