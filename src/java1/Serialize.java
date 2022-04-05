package java1;

import java.io.*;

public class Serialize {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Abc obj = new Abc();
        obj.i = 10;

        File f = new File("Demo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Abc obj2 = (Abc)ois.readObject();
        System.out.println(obj2.i);
    }
}

class Abc implements Serializable{
    int i;
}