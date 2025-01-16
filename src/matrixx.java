import java.util.*;

public class matrixx {
    int[][] data;

    void inputData() {
        Scanner na = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the matrix: ");
        n = na.nextInt();
        data = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter number at [" + i + "][" + j + "]:");
                data[i][j] = na.nextInt();
            }
        }
    }

    void sort() {
        int n = data.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                for (int k = 0; k < n - j - 1; k++) {
                    if (data[i][k] > data[i][k + 1]) {
                        int temp = data[i][k];
                        data[i][k] = data[i][k + 1];
                        data[i][k + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Sorted matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.inputData();
        m.sort();
    }
}