import java.util.*;

public class aaa {
    Scanner scanner = new Scanner(System.in);

    public void calculateMatrixSum() {
        System.out.println("Enter the size of the matrix:");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        System.out.println("Enter the elements of the matrix:");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter number at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of entered numbers: " + sum);
    }
    

    void matrixmultiplication() {
        System.out.println("Enter the size of the first matrix:");
        int size = scanner.nextInt();
        int[][] matrix1 = new int[size][size];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter number at [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the size of the second matrix:");
        int[][] matrix2 = new int[size][size];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter number at [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    void calculateMatrixDiff() {
        System.out.println("Enter the size of the matrix:");
        int size = scanner.nextInt();
        int[][] matrix1 = new int[size][size];
        int[][] matrix2 = new int[size][size];
        int[][] matrix3 = new int[size][size];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter number at [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter number at [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.println("Difference of the two matrices:");
                for (i = 0; i < size; i++) {
                    for (j = 0; j < size; j++) {
                        System.out.print(matrix3[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    void transpose() {
        int rows;
        int cols;
        int[][] arr;
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
        System.out.println("TRANSPOSED ARRAY:");
        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < cols; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void continuee() {
        System.out.println("Do you want to continue");
        System.out.println("1. Yes   2.NO");
        int choice = scanner.nextInt();
        if (choice == 1) {
            displayMenu();
        } else {
            System.exit(0);
        }
    }

    public void executeOption() {
        System.out.println("Enter your option:");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Executing option 1...");
                calculateMatrixSum();
                continuee();
                break;
            case 2:
                System.out.println("Executing option 2...");
                matrixmultiplication();
                continuee();
                break;
            case 3:
                System.out.println("Executing option 3...");
                calculateMatrixDiff();
                continuee();
                break;
            case 4:
                System.out.println("Executing option 4...");
                transpose();
                continuee();
                break;
            default:
                System.out.println("Invalid option");
                continuee();
                break;
        }
    }

    public void displayMenu() {
        System.out.println("THE LIST INCLUDE");
        System.out.println("1.Matrix Sum Calculation");
        System.out.println("2. Matrix Multiplaction");
        System.out.println("3. Matrix Differnece Calculatuion");
        System.out.println("4. Transpose a Matrix");
        executeOption();

    }

    public static void main(String[] args) {
        System.out.println("NAYAN ACHARYA( 27)");
        aaa main = new aaa();
        main.displayMenu();
    }
}