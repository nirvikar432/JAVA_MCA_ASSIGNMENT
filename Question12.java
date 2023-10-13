// Write a program to raise an exception if any attempt
// is made to refer to an element whose index is beyond the array size.

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of elements you want to store: ");
        n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        try {
            System.out.print("Enter the INDEX to check for an exception : ");
            int index = scan.nextInt();
            int element = arr[index];
            System.out.println("Element at index " + index + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception occurs: " + e.getMessage());
        }
    }
}
