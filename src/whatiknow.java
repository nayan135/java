import java.util.Scanner;
import java.io.*;

public class whatiknow {
    // io steam from user input
    Scanner sc = new Scanner(System.in);
    Reader re = new InputStreamReader(System.in);

    void input() {
        System.out.println("Enter a number:");
        String s = sc.nextLine();
        System.out.println("You entered: " + s);

    }

    public static void main(String[] args) {

    }

}
