import java.util.*;

public class onetwo {
    void data(int o) {
        int i, j;
        for (i = 1; i <= o; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + "\t");
            }
            System.out.print("\n");
        }
    }

    void data2(int a) {
        int i, j;
        for (i = a; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        onetwo obj = new onetwo();
        System.out.println("Enter a number ");
        int n = s.nextInt();
        obj.data(n);
        obj.data2(n);

    }
}