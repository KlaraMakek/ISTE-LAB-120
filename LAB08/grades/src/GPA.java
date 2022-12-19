/**
 * A GPA calculator
 * @author Klara Makek
 * @version 31.10.2022.
 * Course: ISTE-120
 * LAB 08
 */
/************** JAVADOC ************************/
public class GPA {

    // convers the points
    public double calcPoints(char grade) {
        switch (grade) {
            case 'a':
            case 'A':
                return 4;

            case 'b':
            case 'B':
                return 3;

            case 'c':
            case 'C':
                return 2;

            case 'd':
            case 'D':
                return 1;

            case 'f':
            case 'F':
                return 0;

        }
        return -1;
        
    }

    /** part 2 **/
    // attributes
    private int sumCredits;
    private int sumWeightPoints;

    // constructor
    public GPA() {
        sumCredits = 0;
        sumWeightPoints = 0;
    }

    // getters
    public int getSumCredits() {
        return sumCredits;
    }

    public int getSumWeightPoints() {
        return sumWeightPoints;
    }
    // Methods for gpa
    public void addToTotals(char grade, int credits) {
        sumCredits += credits;
        sumWeightPoints += calcPoints(grade) * credits;
    }

//calculates
    public double calcGPA(){
        return sumWeightPoints / sumCredits;
    }


}
