class Red {
    public int a, b;

    public Red() {
        a = 0;
        b = 10;
    }
}

public class classTest {
    public static void main(String[] args) {
        Red arr[] = new Red[100];
        arr[0] = new Red();
        arr[99] = new Red();
        arr[0].a = 5;
        arr[99].b = 50;
        System.out.println(arr[0].a);
        System.out.println(arr[99].b);

    }
}
