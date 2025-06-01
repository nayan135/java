import java.util.Scanner;
public class sotring {
    Scanner sc = new Scanner(System.in);
    String input;
    int arr[];
    void Stringinput(){
        System.out.println("Enter the string to sort");
        input = sc.nextLine();
    
    }
    void arrayInput(){
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<size; i++){
            System.out.print("Enter number at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }
    void arraySort(){
        for(int i =0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

    }

    void characterSort(){

    }
    
}
