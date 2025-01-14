import java.util.Scanner;

public class MultidimensionalArray {
    int rows;
    int cols;
    int[][] arr;
    int[][] arrr;

    void entry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        cols = scanner.nextInt();

        arr = new int[rows][cols];
        arrr = new int[rows][cols];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arrr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The first array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The second array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arrr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void addition() {
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = arr[i][j] + arrr[i][j];
            }
        }
        if()
        System.out.println("ADDITION:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        MultidimensionalArray obj = new MultidimensionalArray();
        obj.entry();
        obj.addition();
    }
}
