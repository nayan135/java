import java.util.Scanner;
import java.io.*;

public class filewriteread {
    Scanner sc = new Scanner(System.in);
    String filename = "data.txt";

    void writeToFile() {
        String input = "";
        try {
            FileWriter writer = new FileWriter(filename);
            System.out.println("Enter text (type 'exit' to finish):");

            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("exit")) break;
                writer.write(line + "\n");
            }

            writer.close();
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
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
