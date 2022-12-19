import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *  Student
 * @author Klara Makek
 * @version 25.1.2022.
 * Course: ISTE-120
 * HW 11
 */
/************** JAVADOC ************************/
public class CopyA {

    public static void main(String[] args) {
        // if arguments are 3 then...
        if (args.length == 3) {
            String inputFile = args[0];
            String outputFile = args[1];
            String thing = args[2];

            // Scanner
            Scanner reader = null;
            try {
                reader = new Scanner(new File(inputFile));
            } catch (FileNotFoundException g) {
                System.exit(1);
            }
            // Print Reader
            PrintWriter writer = null;
            try {
                writer = new PrintWriter(new FileOutputStream(new File(outputFile), thing.equals("a")));
                String data = reader.nextLine(); // scanner instilled
                while (!data.equals("")) {
                    writer.println(data);
                    try {
                        data = reader.nextLine();
                    } catch (NoSuchElementException w) {
                        break;
                    }
                }
                writer.close();
                reader.close();
            } catch (IOException s) {
                System.exit(2);
            }
            System.exit(0);
        }
    }
}
