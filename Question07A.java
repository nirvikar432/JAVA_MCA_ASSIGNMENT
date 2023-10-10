//Write a program for overloading operator++ and operator—using friend functions

import java.util.Scanner;

class OpOverload {
    private int value;

    OpOverload(int val) {
        this.value = val;
    }

    public void increment() {
        this.value++;
    }

    public void decrement() {
        this.value--;
    }

    public void getValue() {
        System.out.println(this.value);
    }
}

public class Question07A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        OpOverload op1 = new OpOverload(num);
        System.out.println("Original Value");
        op1.getValue();

        do {
            System.out.println("Press 1 For Increment");
            System.out.println("Press 2 For Decrement");
            System.out.println("Press 0 For Exit");
            num1 = sc.nextInt();
            if (num1 == 1) {
                op1.increment();
                System.out.println("Value after increment");
                op1.getValue();
            }
            if (num1 == 2) {
                op1.decrement();
                System.out.println("Value after decrement");
                op1.getValue();
            }
        } while (num1 != 0);

    }

}
