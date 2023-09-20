// Write a Program to design a class having static member function named
// showcount() which has the property of
// displaying the number of objects created of the class.

class Student {
    String name;
    static int count = 0;

    public Student(String name) {
        this.name = name;
        count++;
    }

    static void showcount() {
        System.out.println("Number of object created till now is : " + count);
    }
}

public class Question01 {
    public static void main(String[] args) {
        Student st1 = new Student("Amit");
        Student st2 = new Student("Aman");
        Student.showcount();
    }
}

/*
 * 
 * 
 * Number of object created till now is : 2
 */