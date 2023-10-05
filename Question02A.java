// Write a Program which creates & uses array of object of a class.
// ( for eg. implementing the list of Managers of a Company having details such as Name, Age, etc..).

import java.util.Scanner;

class Manager {
    String name;
    int age;

    public Manager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showDetails() {
        System.out.println("Name : " + name + " and age : " + age);
    }
}

public class Question02A {
    public static void main(String[] args) {
        System.out.print("Enter the number of objects to be created: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Manager mg1[] = new Manager[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();
            mg1[i] = new Manager(name, age);

        }

        for (int i = 0; i < num; i++) {
            mg1[i].showDetails();
        }
    }
}