
abstract class abstractclass {
    public abstract void display();
}

public class abstrac extends abstractclass {
    public void display() {
        System.out.println("THis shows shows the abstraction in JAVA");
    }

    public static void main(String[] args) {
        abstractclass obj = new abstrac();
        obj.display();
    }
}