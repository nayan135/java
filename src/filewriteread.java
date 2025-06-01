import java.util.Scanner;
import java.io.*;

public class filewriteread {
    Scanner sc = new Scanner(System.in);
    String filename = "data.txt"; 

    void writeToFile() {
        try {
            System.out.print("Enter a line to save in file: ");
            String input = sc.nextLine();

            FileWriter writer = new FileWriter(filename);
            writer.write(input);
            writer.close();

            System.out.println("Successfully written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing: " + e.getMessage());
        }
    }

    void readFromFile() {
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);

            System.out.println("Reading from file:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        filewriteread obj = new filewriteread();
        obj.writeToFile();
        obj.readFromFile();
    }
}
