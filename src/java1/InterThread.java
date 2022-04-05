package java1;

public class InterThread {

    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}

class Q{

    int i;
    boolean valueSet = false;

    synchronized void put(int i){
        while (valueSet){
            try { wait(); } catch (Exception e){}
        }
        this.i = i;
        System.out.println("Put : " + this.i);
        valueSet = true;
        notify();
    }

    synchronized void get(){
        while (!valueSet){
            try { wait(); } catch (Exception e){}
        }
        System.out.println("Get : " + this.i);
        valueSet = false;
        notify();
    }

}

class Producer implements Runnable{
    Q q;

    Producer(Q q){
        this.q = q;
        Thread t = new Thread(this,"Producer");
        t.start();
    }

    public void run(){
        int i = 0;

        while (true){
            q.put(i++);
            try {Thread.sleep(1000);} catch (Exception e){}
        }
    }
}

class Consumer implements Runnable{
    Q q;

    Consumer(Q q){
        this.q = q;
        Thread t = new Thread(this,"Consumer");
        t.start();
    }

    public void run(){
        while (true){
            q.get();
//            try {Thread.sleep(500);} catch (Exception e){}
        }
    }
}