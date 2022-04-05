package designPatterns.creational.singleton;

public class SingletonObject {

    private static SingletonObject obj;

    private SingletonObject(){}

    public static SingletonObject getInstance(){
        if(obj == null){
            obj = new SingletonObject();
        }
        return obj;
    }
}
