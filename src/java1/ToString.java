package java1;

public class ToString {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Ekansh");
        System.out.println(s1);
    }
}

class Student{

    int rollNo;
    String name;

    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString(){
        return "Student {rollNo: " + rollNo + ", Name: " + name + "}";
    }

}