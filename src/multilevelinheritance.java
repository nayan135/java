class base {
    void ba() {
        System.out.println("this is base class printing via derive class");
    }
}

class derive extends base {
    void display() {
        System.out.println("This is derive class");
    }
}

public class multilevelinheritance extends derive {
    void display() {
        System.out.println("This is derive class");

    }

    public static void main(String args[]) {
        multilevelinheritance obj = new multilevelinheritance();
        obj.ba();
        obj.display();
    }

}
