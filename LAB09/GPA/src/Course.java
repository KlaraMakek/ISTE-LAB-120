/**
 * A GPA calculator
 * 
 * @author Klara Makek
 * @version 7.11.2022.
 * Course: ISTE-120
 * LAB 09 part 3/1
 */

// corses initializer
public class Course {
    int credits;
    String grade;

    /**
     * constructor
     * 
     * @param credits
     * @param grade
     */
    public Course(int credits, String grade) {
        this.credits = credits;
        this.grade = grade;
    }

    /**
     * get the credits
     * 
     * @return credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * get the grade
     * 
     * @return grade
     */
    public String getGrade() {
        return grade;
    }
}
