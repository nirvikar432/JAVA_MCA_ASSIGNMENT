// Write a Program which creates & uses array of object of a class.
// ( for eg. implementing the list of Managers of a Company having details such as Name, Age, etc..).

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

public class Question02 {
    public static void main(String[] args) {
        Manager mg1[] = new Manager[3];
        mg1[0] = new Manager("Aman", 20);
        mg1[1] = new Manager("Arun", 21);
        mg1[2] = new Manager("Amit", 20);

        for (int i = 0; i < 3; i++) {
            mg1[i].showDetails();
        }
    }
}

/*
 * 
 * 
 * 
 * Name : Aman and age : 20
 * Name : Arun and age : 21
 * Name : Amit and age : 20
 */