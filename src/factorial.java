public class factorial {
   
    static int fac(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 4; 
        int fact = fac(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
