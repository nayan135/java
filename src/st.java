import java.util.*;
public class st {
 String str;
 Scanner sc = new Scanner(System.in);
 void data(){
    System.out.println("Enter your string");
    str= sc.nextLine();
    System.out.println("Length of String: "+str.length());
    
 }
 // function to reverse the string
 void reverse(){
    String rev="" ;
    for (int i = str.length()-1; i >= 0; i--)
    {
        rev = rev + str.charAt(i);
        }
             System.err.println("Reversed String: "+rev);
}
void ser(){
    String n="";
    System.err.println("Enter char to search");
     n = sc.nextLine();
    
     for(int i=0; i<str.length(); i++){
        char h= str.charAt(i);
        if(h == n.charAt(0)){
            System.out.println("Char found at index: "+i);
    }        
}
}
void sorrt(){
    String s;
    System.out.println("Enter char to sort");
    s = sc.nextLine();
    char[] arr = str.toCharArray();

    System.out.println("Sorted String: "+new String(arr));

}
public static void main(String[] args) {
    st s = new st();
    s.data();
    s.reverse();
    s.ser();
    s.sorrt();
}
}