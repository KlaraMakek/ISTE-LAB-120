
/**
 * A GPA calculator
 * @author Klara Makek
 * @version 7.11.2022.
 * Course: ISTE-120
 * LAB 09 part 2
 */
/**************JAVADOC************************/
/** public class GPA {

    int numCourses; // number of courses - can be changed
    int[] credits; // number of credits for a course
    String[] grade;
    int maxCourses;
    int sumGrade;
    int sumCredits;

    / / constructor
    public GPA(int _maxCourses) {
        credits = new int[_maxCourses]; // for credits
        grade = new String[_maxCourses]; // for grades
        numCourses = 0; // number of courses
    }
/**
 * initializer for corses
 * @param _credits are credits
 * @param _grade are grade
 * /
    public void addCourse(int _credits, String _grade) {
        credits[numCourses] = _credits;
        grade[numCourses] = _grade;
        numCourses++;
    }

    public Object calcGPA() {
        for (int lett = 0; lett < numCourses; lett++) {
            sumCredits += credits[lett]; // sum of credit
            sumGrade += credits[lett] * letterToNumeric(grade[lett]); // sum of grade
        }

        return (double) sumGrade / sumCredits;

    }

    / / ties numbers and letters to echoder
    public static int letterToNumeric(String letterGrade) {

        switch (letterGrade.charAt(0)) {
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
}*/

/**
 * A GPA calculator
 * @author Klara Makek
 * @version 7.11.2022.
 * Course: ISTE-120
 * LAB 09 part 3/2
 */
import java.util.ArrayList;

public class GPA {
    // new array list corses
    private ArrayList<Course> courses;

    // constructor
    // list
    public GPA(int _maxCourses) {
        courses = new ArrayList<Course>();
    }

    /**
     * initializer for corses
     * 
     * @param _credits are credits
     * @param _grade   are grade
     */
    public void addCourse(int _credits, String _grade) {
        courses.add(new Course(_credits, _grade));
    }

    /**
     * if entered number/letter is 0 then return 0
     * 
     * @return
     */
    public double calcGPA() {
        if (courses.size() == 0) {
            return 0;
        }
        ;
        // setting is as double
        double sumCredits = 0, sumGrade = 0;
        /**
         * calculates the entered things
         */
        for (int lett = 0; lett < courses.size(); lett++) {
            sumCredits += courses.get(lett).getCredits(); // get and sets the credit sum
            sumGrade += courses.get(lett).getCredits() * letterToNumeric(courses.get(lett).getGrade()); // gets and sets
                                                                                                        // the grade sum
        }
        // returned the calculation
        return sumGrade / sumCredits;

    }

    // ties numbers and letters to echoder
    public static int letterToNumeric(String letterGrade) {

        switch (letterGrade.charAt(0)) {
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
