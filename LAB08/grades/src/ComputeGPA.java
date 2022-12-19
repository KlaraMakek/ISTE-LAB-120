import java.util.Scanner;

/**
 * A GPA calculator
 * @author Klara Makek
 * @version 31.10.2022.
 * Course: ISTE-120
 * LAB 08
 */
/************** JAVADOC ************************/
public class ComputeGPA {
    public static void main(String[] args) {
        // scanner
        Scanner in = new Scanner(System.in);

        int gpaCounter = 0;
        char theGrade = 'A';

        // number of corses
        System.out.print("Enter the number of corses:");
        int corses = in.nextInt();
        // if entered number is less or 0 then prints error
        while (corses <= 0) {
            System.out.println("Error - invalid input - must be grater then 0!");
            break;
        }
        // for the loop of grades and calculating
        while (gpaCounter / 1 < corses) {
            /**
             * first
             * 
             * System.out.print("Enter grade (one character): ");
             * char grade = in.next().charAt(0);
             * grade = Character.toUpperCase(grade);
             * GPA test = new GPA();
             * System.out.print("\nPoints: " + test.calcPoints(grade) + "\n");
             */

            /** second */
            // link
            GPA test = new GPA();
            /*** character ****/
            System.out.print("\nEnter grade (one character): ");
            String grade = in.next().toUpperCase();
            // if grade has more then 1 letter error
            if (grade.length() != 1) {
                System.out.println("Error - invalid impute - entry must be only 1 letter and from A-F");
                continue; // god sent this is god sent
            } else {
                theGrade = grade.charAt(0);
            }

            /*** credits ****/
            System.out.print("\nEnter credits: ");
            int credits = in.nextInt();
            // if credits more then 9 or less then 0 then error
            if (credits < 0 || credits > 9) {
                System.out.println("Error - invalid impute - entry must be bettwen 0 and 9");
                continue;
            }
            // calculates
            test.addToTotals(theGrade, credits);
            // prints...
            System.out.printf("Sum points: %d Sum credits: %d", test.getSumWeightPoints(), test.getSumCredits());
            // prints...
            gpaCounter += 1;
            if (gpaCounter % corses == 0) {
                System.out.printf("\nGPA: %.2f", test.calcGPA());
            }
        }

    }
}
