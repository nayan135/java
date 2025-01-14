import java.util.Scanner;

public class strco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] characters = input.toCharArray();

        for (int i = 0; i < characters.length - 1; i++) {
            for (int j = 0; j < characters.length - 1 - i; j++) {
                if (characters[j] > characters[j + 1]) {
                    char temp = characters[j];
                    characters[j] = characters[j + 1];
                    characters[j + 1] = temp;
                }
            }
        }

        String sortedString = new String(characters);

        System.out.println("Sorted string: " + sortedString);

        scanner.close();
    }
}