package java1;

// if threads are calling same method at the same time, then to call them synchronously "synchronized" keyword is used.

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

//        obj1.start();
//        obj2.start();

//        Runnable obj3 = new Bye();
//        Runnable obj4 = new Haha();



        Thread t1 = new Thread(() -> {
            for(int i=0; i<5; i++){
                System.out.println("Bye");
                try {
                    Thread.sleep(500);
                }catch (Exception e){}
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Haha");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });
        t1.start();
        t2.start();

        System.out.println(t1.isAlive());
        t1.join(); //join will wait for the htread to complete and join main thread
        t2.join();

        System.out.println(t1.isAlive());

        System.out.println("heyyyyyyyy");
    }
}

class Hi extends Thread{

    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}

class Hello extends Thread{

    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}

class Bye implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Bye");
            try {
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}

class Haha implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Haha");
            try {
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}