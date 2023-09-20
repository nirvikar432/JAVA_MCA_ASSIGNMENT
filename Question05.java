//Write a Program using copy constructor to copy data of an object to another object.
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Student c) {
        this.name = c.name;
        this.age = c.age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Question05 {
    public static void main(String[] args) {
        Student s1 = new Student("NIRVIKAR", 23);
        Student s2 = new Student(s1);

        System.out.println("Constructor Call");
        s1.display();

        System.out.println("Copy Constructor call");
        s2.display();

    }

}

/*
 * 
 * 
 * Constructor Call
 * Name: NIRVIKAR
 * Age: 23
 * Copy Constructor call
 * Name: NIRVIKAR
 * Age: 23
 */
