import java.util.*;

public class common {
    Scanner sc = new Scanner(System.in);
    int[] arr;
    int size;
    int[] arrr;
    int sizee;

    void fun() {
        System.out.println("Enter the no of elements FOR FIRST ARRAY ");
        size = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element");
            arr[i] = sc.nextInt();
        }
    }

    void fun2() {
        System.out.println("Enter the no of elements FOR SECOND ARRAY ");
        sizee = sc.nextInt();
        arrr = new int[sizee];
        for (int i = 0; i < sizee; i++) {
            System.out.println("Enter the element");
            arrr[i] = sc.nextInt();
        }
    }

    void process() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arrr.length; j++) {
                if (arr[i] == arrr[j]) {
                    if (i == j) {
                        System.out.println("common element is " + arr[i]);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        common c = new common();
        c.fun();
        c.fun2();
        c.process();

    }
}
