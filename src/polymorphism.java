public class polymorphism {
    void add(int a, int b) {
        System.out.println("Sum of two numbers is : " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three digits is: " + (a + b + c));
    }

    public static void main(String args[]) {
        polymorphism obj = new polymorphism();
        obj.add(10, 20);
        obj.add(10, 20, 30);

        
    }
}
