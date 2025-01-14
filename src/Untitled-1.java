
import java.util.Scanner;

public class max {

    public static void m(int[] data) {
        
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
      
            System.out.println("Max number: " + data[data.length - 1]);
       
    }

    public static void main(String[] args) {
        Scanner na = new Scanner(System.in);
        int n = 0;
        int[] data;
        
        System.out.println("Enter the number of elements: ");
        n = na.nextInt();
        
        if (n > 0) {
            data = new int[n];
            
            for (int i = 0; i < n; i++) {
                System.out.println("Enter number " + (i + 1) + ": ");
                data[i] = na.nextInt();
            }
            
            m(data);
        } else {
            System.out.println("Invalid array size.");
        }
        
        na.close();
    }
}
