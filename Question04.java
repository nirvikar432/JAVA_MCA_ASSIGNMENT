//Write an inline function to find largest of three number

public class Question04 {

    public static void main(String[] args) {
        int val1 = 20, val2 = 30, val3 = 40;
        System.out.println("Largest number is " + largest(val1, val2, val3));
    }

    static int largest(int val1, int val2, int val3) {
        if (val1 > val2 && val1 > val3)
            return val1;
        else if (val2 > val1 && val2 > val3)
            return val2;
        else
            return val3;

    }

}

/*
 * 
 * Largest number is 40
 */