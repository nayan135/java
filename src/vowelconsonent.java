import java.util.Scanner;

public class vowelconsonent {
    Scanner sc = new Scanner(System.in);
    String input;
    char ch[];

    void input() {
        System.out.println("Enter char to check if it is vowel or consonent");
        input = sc.nextLine();
        ch = input.toCharArray();
    }

    void vowelcheck() {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
                    ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                System.out.println(ch[i] + " is a vowel");
            } else {
                System.out.println(ch[i] + " is a consonant");
            }
        }

    }

    public static void main(String[] args) {
        vowelconsonent obj = new vowelconsonent();
        obj.input();
        obj.vowelcheck();
    }

}
