import java.util.*;

public class array {
    Scanner sc = new Scanner(System.in);

    void arr() {
        int[] arr = new int[5];
        System.out.println("Enter data in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Data in the array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("Sorting the array" + Arrays.toString(arr));
        
    }

    public static void main(String args[]) {
        array obj = new array();
        obj.arr();
    }
}
