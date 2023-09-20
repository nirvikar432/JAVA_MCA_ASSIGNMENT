//Write a program for overloading operator++ and operator—using friend functions
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

public class Question07 {
    public static void main(String[] args) {
        OpOverload op1 = new OpOverload(20);
        System.out.println("Original Value");
        op1.getValue();
        op1.increment();
        System.out.println("Value after increment");
        op1.getValue();
        op1.decrement();
        System.out.println("Value after decrement");
        op1.getValue();
    }

}

/*
 * 
 * 
 * Original Value
 * 20
 * Value after increment
 * 21
 * Value after decrement
 * 20
 */
