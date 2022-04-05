package java1;

public class InnerClassDemo {

    public static void main(String[] args) {

        //1. member inner class
        InnerDemo obj = new InnerDemo();
        InnerDemo.MemberInner obj2 = obj.new MemberInner();
        obj2.i = 10;

        //2. static inner class
        InnerDemo.StaticInner obj3 = new InnerDemo.StaticInner();
        obj3.j = 20;

        //3. Anonymous inner class
        B b = new B(){
            public void show(){
                System.out.println("Hi");
            }
        };
        b.show();

        //4. Lambda
        C c = new C(){
            @Override
            public void show() {
                System.out.println("lambda show");
            }

            @Override
            public void show2() {
                System.out.println("lambda show2");
            }
        };
        c.show();
        c.show2();
    }
}

class InnerDemo{

    class MemberInner{
        int i;
    }

    static class StaticInner{
        int j;
    }
}

class B{

    public void show(){
        System.out.println("class B");
    }
}

interface C{
    void show();
    void show2();
}