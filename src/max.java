import java.util.Scanner;

public class max {

    public static void m(int[] data) {
        int max = data[0];
        int min = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
            if (data[i] < min) {
                min = data[i];
            }
        }

        System.out.println("Max number: " + max);

        System.out.println("Min number: " + min);

    }

    public static void main(String[] args) {
        Scanner na = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = na.nextInt();

        if (n > 0) {
            int[] data = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter number " + (i + 1) + ": ");
                data[i] = na.nextInt();
            }

            m(data);
        } else {
            System.out.println("Invalid array size.");
        }

    }
}
