//Write a Program using copy constructor to copy data of an object to another object.

import java.util.Scanner;

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

public class Question05A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.print("Enter Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();
            Student s1 = new Student(name, age);
            Student s2 = new Student(s1);

            System.out.println("Constructor Call");
            s1.display();

            System.out.println("Copy Constructor call");
            s2.display();

            System.out.println("Do you want to run again ? Press 0 for EXIT ");
            ch = sc.nextInt();

        } while (ch != 0);

    }

}