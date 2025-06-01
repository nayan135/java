import java.util.Scanner;

public class strbuild {
    Scanner sc = new Scanner(System.in);
    String str = "";

    // string builder
    void input() {
        System.out.println("Enter some string ");
        str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        System.out.println("Original String: " + sb);
        System.out.println("String Length: " + sb.length());
        sb.append("K XAAA");
        System.out.println("After append: " + sb);
        sb.insert(6, "Randomly selected");
        System.out.println("After insert: " + sb);
        sb.reverse();
        System.out.println("Reversed String: " + sb);
    }

    public static void main(String[] args) {
        strbuild s = new strbuild();
        s.input();

    }
}
