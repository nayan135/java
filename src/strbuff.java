import java.util.Scanner;

public class strbuff {
    Scanner sc = new Scanner(System.in);
    String str = "";

    // string buffer
    void input() {
        System.out.println("Enter some string ");
        str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);

        System.out.println("Original String: " + sb);
        System.out.println("String Length: " + sb.length());
        System.out.println("String Capacity: " + sb.capacity());
        sb.append("K XAAA");
        System.out.println("After append: " + sb);
        sb.insert(6, "Randomly selected");
        System.out.println("After insert: " + sb);
        sb.reverse();
        System.out.println("Reversed String: " + sb);
    }

    public static void main(String[] args) {
        strbuff s = new strbuff();
        s.input();

    }
}
