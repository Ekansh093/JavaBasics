package java1;

import java.util.ArrayList;

public class JavaGenerics {

    public static void main(String[] args) {
        Generic<Integer> obj = new Generic();
        obj.setValue(1);
        obj.show();
        obj.test(new ArrayList<Number>());
    }
}

class Generic<T extends Number>{

    T value;

    public void show(){
        System.out.println(value.getClass().getName());
    }

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public void test(ArrayList<? super Integer> list){

    }

}