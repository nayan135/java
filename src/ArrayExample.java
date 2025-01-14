import java.util.*;

public class ArrayExample { 
    private Scanner na = new Scanner(System.in);
    private  int n=0;
     private int data[]; 
     public void ary() {
        System.out.println("enter requirement for sum ");
        n = na.nextInt();
        data = new int[n];
        int i;
        int d = 0; 
        for (i = 0; i<n; i++) { 
            System.out.println("Enter number to add: ");
            data[i] = na.nextInt(); 
        }
       
        for (i = 0; i < n; i++) {
            d = d + data[i]; 
        }
 
        System.out.println("Sum of Entered numbers: " + d);
    }
   public void ar(){
    for(int i=0; i<data.length; i++){
        for(int j =i+1; j<data.length; j++){
            if(data[i]>data[j]){
                int temp =data[i];
                data[i]= data[j];
                data[j]=temp;
            }
        }
    }
    System.out.println("Sorted array: ");
    for(int i= 0; i<data.length; i++){
    System.out.println(data[i]);
    }
    
    }

    public static void main(String[] args) {
        ArrayExample a = new ArrayExample(); 
        a.ary();
        a.ar();
        
    }
}
