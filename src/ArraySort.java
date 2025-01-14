import java.util.Scanner;

    int[] array;
    int size;

    void sortArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
         
        System.out.print(array[i] + " ");
    }System.out.println();
    }

    public static void main(String[] args) {
        ArraySort na = new ArraySort();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        size = scanner.nextInt();
        array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < na.size; i++) {
            na.array[i] = scanner.nextInt();
        }

        System.out.println("Original array: ");
        na.printArray();
        na.sortArray();

        System.out.println("Sorted array: ");
        na.printArray();

        scanner.close();
    }
}
