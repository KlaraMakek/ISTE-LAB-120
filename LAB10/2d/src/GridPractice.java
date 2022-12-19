import java.util.Scanner;
import java.util.Random;

/**
 * GridPractice - Class to work with 2D arrays
 * ISTE-120 Lab 10 Starter Code
 * 
 * @author D. Patric (adapted from J. Leone/R. Niemi)
 * @version 2201
 */

/**
* GridPractice - Class to work with 2D arrays
* @author Klara Makek
* @version 16.11.2022.
* Course: ISTE-120
* LAB 10
*/
/************** JAVADOC ************************/

public class GridPractice {
   public static void main(String[] args) {
      // declarations
      Scanner in = new Scanner(System.in);
      Random generator = new Random();
      int[][] grid; // un-instantiated grid
      int size = 0; // number of rows and columns

      // get size of grid - no validation & instantiate
      System.out.print("Enter size of grid: ");
      size = in.nextInt();
      grid = new int[size][size];

      // fill grid with random number from 1..99
      System.out.println();
      for (int row = 0; row < size; row++) {
         for (int col = 0; col < size; col++) {
            grid[row][col] = generator.nextInt(100); // random numbers 0.99 - not 100
         }
      }

      // STEP 3(exercise 1): print grid with formatting to align

      // * prints the intro text
      System.out.printf("Random values assigned to %d by %d grid%n", size, size);
      for (int a = 0; a < size; a++) {
         for (int b = 0; b < size; b++) {
            // prints the grid
            System.out.printf("%3d", grid[a][b]);
         }
         System.out.println();
      }
      // STEP 4A (exercise 2): print each row sum
      System.out.println("\nRow   Sum" + "\n---------");
      for (int a = 0; a < size; a++) {
         int sum = 0;
         for (int b = 0; b < size; b++) {
            sum += grid[a][b]; // it gets the sum of rows
         }
         // prints the grid
         System.out.printf("%3d %3d%n", a, sum);

      }
      // STEP 4B (exercise 2): print each column sum
      System.out.println("\nCol  Sum" + "\n---------");
      for (int a = 0; a < size; a++) {
         int sum = 0;
         for (int b = 0; b < size; b++) {
            sum += grid[b][a]; // it gets the sum of column
         }
         // prints the grid
         System.out.printf("%3d %3d%n", a, sum);

      }
      // STEP 5 (exercise 3): print two diagonal sums
      int sum = 0;
      for (int a = 0; a < size; a++) {
         sum += grid[a][a]; // it gets the sum of rows
      }
      // prints the grid
      System.out.printf("\nDiagonal total from upper left to lower right is %d.%n%n", sum);
      sum = 0;
      for (int a = 0; a < size; a++) {
         sum += grid[grid.length - 1 - a][a]; // it gets the sum of column
      }
      // prints the grid
      System.out.printf("Diagonal total from upper left to lower right is %d.", sum);
   }

}
