import java.util.Scanner;

public class vowelconsonent {
    Scanner sc = new Scanner(System.in);
    char ch;

    void input() {
        System.out.println("Enter char to check if it is vowel or consonent");
        ch = sc.next().charAt(0);

    }

    void vowelcheck() {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("The character is a vowel.");
        } else {
            System.out.println("The character is a consonant.");
        }

    }

    public static void main(String[] args) {
        vowelconsonent obj = new vowelconsonent();
        obj.input();
        obj.vowelcheck();
    }

}
