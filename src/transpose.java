import java.util.Scanner;

public class transpose {
    int rows;
    int cols;
    int[][] arr;

    void entry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        cols = scanner.nextInt();
        arr = new int[rows][cols];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The first array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < cols; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        transpose obj = new transpose();
        obj.entry();
       

    }
}
