package java1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {

    //reflection API is used to call a private method of a class
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName("java1.Demo");
        Demo d = (Demo)c.newInstance();
        Method m = c.getDeclaredMethod("print",null);
        m.setAccessible(true);
        m.invoke(d, null);
    }
}

class Demo{

    private void print(){
        System.out.println("private method invoked");
    }
}