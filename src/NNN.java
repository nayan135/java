import java.util.*;
public class NNN {
private String name;
private int age;
private int grade;
   public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name: ");
         name = sc.nextLine();
        System.out.println("Enter your age");
         age = sc.nextInt();
        System.out.println("Enter your Class");
       grade = sc.nextInt();
       
        
    }
    public void out(){
        System.out.println("Your name is "+name);
        System.out.println("Your age is "+ age);
        System.out.println("Your class is "+grade);
    }
    /*name class age 
    */
public static void main(String n[]){
  NNN na= new NNN();
  na.input();
  na.out();
}
}


















