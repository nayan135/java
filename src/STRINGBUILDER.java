import java.util.Scanner;
public class StringBuilderExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value:");
        String str = sc.nextLine();
        if(str.length()>5){
            System.out.println("String is greater than 5 SO can't process the info");
            System.exit(0);
        }
        StringBuilder sb = new StringBuilder(str);       
        System.out.println("Original String: " + str);   
        System.err.println("Chat at index 0: "+sb.charAt(0));
        System.err.println("Chat at index 1: "+sb.charAt(1));
        System.err.println("Chat at index 2: "+sb.charAt(2));
        System.err.println("Chat at index 3: "+sb.charAt(3));
        System.err.println("Chat at index 4: "+sb.charAt(4));
        System.out.println("Reversed String: " + sb.reverse());
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
        sb.append(" What's Up");
        System.out.println("After append: " + sb);
        sb.insert(5, " HELLO ");
        System.out.println("After insert: " + sb);
        sc.close(); 
    }
}