import java.io.*;
/**
 *  Student
 * @author Klara Makek
 * @version 25.1.2022.
 * Course: ISTE-120
 * HW 11
 */
/************** JAVADOC ************************/
public class Copy {

    public static void main(String[] args) {
        // if arguments are 3 then...
        if (args.length == 3) {
            // initialize elements
        String inputFile = args[0];
        String outputFile = args[1];
        String thing = args[2];

        // File Reader 
        FileReader reader = null;
        try {
            reader = new FileReader(inputFile);
        } catch (FileNotFoundException g) {
            System.exit(1);
        }
        // File Writer
        FileWriter writer = null;
        try {
            writer = new FileWriter(outputFile, thing.equals("a"));
            int data = reader.read();
            while (data != -1) {
                writer.write(data);
                data = reader.read();
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
