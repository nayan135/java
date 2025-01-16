class sup {
    void display() {
        System.out.println("This is super/base class");

    }

}

public class singleinheritance extends sup {
    void display() {
        System.out.println("This is derived class");

    }

    public static void main(String args[]) {
        singleinheritance obj = new singleinheritance();
        obj.display();
    }
}