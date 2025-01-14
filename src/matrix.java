
import java.util.*;

public class matrix {
    private Scanner na = new Scanner(System.in);
    private int n = 0;
    private int[][] data;


    public void ary() {
        System.out.println("Enter the size of the matrix : ");
        n = na.nextInt();
        data = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter number at [" + i + "][" + j + "]: ");
                data[i][j] = na.nextInt();
                sum += data[i][j];
            }
        }
  System.out.println("Sum of entered numbers: " + sum);
    }
 public void ar() {
        for(int i=0; i<data.length; i++){
            for(int j=0; j<data.length; j++){
            for(int k =i+1; k<data.length; k++){
                if(data[i][j]>data[k]){
                    int temp =data[i][j];
                    data[i][j]= data[k];
                    data[k]=temp;
                }
            }
        }
        }
        System.out.println("Sorted matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        matrix matrix = new matrix();
        matrix.ary();
        //matrix.ar();
    }
}

