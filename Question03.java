//Write a Program to swap private data members of classes named as class_1, class_2.

class Class_1 {
    private int data1;

    public Class_1(int data) {
        this.data1 = data;
    }

    public void setData(int value) {
        this.data1 = value;
    }

    public int showData() {
        return this.data1;
    }

}

class Class_2 {
    private int data1;

    public Class_2(int data) {
        this.data1 = data;
    }

    public void setData(int value) {
        this.data1 = value;
    }

    public int showData() {
        return this.data1;
    }

    public static void swap(Class_1 obj, Class_2 obj1) {
        int temp = obj1.data1;
        obj1.data1 = obj.showData();
        obj.setData(temp);
    }
}

public class Question03 {
    public static void main(String[] args) {
        Class_1 c1 = new Class_1(20);
        Class_2 c2 = new Class_2(02);

        System.out.println("Before Swapping : " + c1.showData() + " " + c2.showData());
        Class_2.swap(c1, c2);
        System.out.println("After Swapping : " + c1.showData() + " " + c2.showData());
    }

}

/*
 * 
 * 
 * Before Swapping : 20 2
 * After Swapping : 2 20
 */