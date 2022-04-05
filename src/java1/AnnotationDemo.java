package java1;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@TestConfig(name = "Ekansh", mobile = 999999)
public class AnnotationDemo {


    public void test(){}

    public static void main(String[] args) {

        AnnotationDemo obj = new AnnotationDemo();

        Class c = obj.getClass();
        Annotation an = c.getAnnotation(TestConfig.class);
        TestConfig tc = (TestConfig) an;
        System.out.println(tc.name());
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface TestConfig{

    String name() default "Hello";
    int mobile();

}