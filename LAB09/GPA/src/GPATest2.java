
/**
 * A GPA calculator
 * @author Klara Makek
 * @version 7.11.2022.
 * Course: ISTE-120
 * LAB 09 part 1
 */
import java.util.Scanner;

public class GPATest2 {

    public static void main(String[] args) {

        // max number of corses
        final int numbCor = 4;
        // scanner
        Scanner in = new Scanner(System.in);
        // "initializer" for credits
        int[] credits = new int[numbCor];
        // "initializer" for letter to grade
        char[] letterGrade = new char[numbCor];
        // "initializer"...
        int sumGrade = 0;
        int sumCredits = 0;

        /** for loop to get all 4 corses and credits */
        for (int lett = 0; lett < numbCor; lett++) {
            // print... grades
            System.out.printf("\nEnter the grade for the %d course:  ", lett + 1);
            letterGrade[lett] = in.next().charAt(0);
            // print... credits
            System.out.printf("\nEnter the credits for the %d class:  ", lett + 1);
            credits[lett] = in.nextInt();
        }
        // to get credits
        for (int ligma : credits) {
            sumCredits += ligma;
        }
        // to get grades
        for (int lett = 0; lett < numbCor; lett++) {
            sumGrade += credits[lett] * letterToNumeric(letterGrade[lett]);
        }
        // prints and calculates GPA
        System.out.printf("GPA is: %.2f", (double) sumGrade / sumCredits);
        in.close();
    }

    // ties numbers and letters to echoder
    public static int letterToNumeric(char letterGrade) {

        switch (letterGrade) {
            case 'a':
                return 4;
            case 'A':
                return 4;

            case 'b':
                return 3;
            case 'B':
                return 3;

            case 'c':
                return 2;
            case 'C':
                return 2;

            case 'd':
                return 1;
            case 'D':
                return 1;

            case 'f':
                return 0;
            case 'F':
                return 0;

            default:
                return -1;

        }

    }
}
