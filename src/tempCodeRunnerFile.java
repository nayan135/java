import java.util.*;
class Prime {
    int a; 
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        a = sc.nextInt();
    }
    void fab() {
        int n = 0, b = 1;
        for (int i = 1; i <= a; i++) {
            int num3 = n + b;
            System.out.print(" " + num3);
            n = b;
            b = num3;
        }
        System.out.println(); 
    }
    void primenumber() {
        int i, count = 0;
        for (i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
        public static void main(String args[]) {
        Prime ob = new Prime();
        ob.input();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("1 to check for prime number, 2 for Fibonacci sequence:, 3 for all");
        int choice = sc.nextInt();
         switch (choice) {
            case 1:
                ob.primenumber(); 
                break;
            case 2: 
                ob.fab();
                break;
                case 3:
                ob.fab();
                ob.primenumber();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
