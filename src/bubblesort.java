import java.util.*;

public class bubblesort {
    int[] arr;
    Scanner sc = new Scanner(System.in);

    void data() {
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        bubblesort obj = new bubblesort();
        obj.data();
    }
}
