/**
 * Description: a simple quiz calculator
 * @author Klara Makek
 * @version 25.9.2022.
 * Course: ISTE-120
 * LAB- 03-3
 */
 /**************JAVADOC************************/
public class TestQuizCalculator {
    public static void main(String[] args) {
        /**
         * new student
         */
    QuizCalculator quiz1 = new QuizCalculator();
        //set the values
    String name = "William Johnson";
    double totNumb = 14;
    double score = 78;
    double getAverage = score / totNumb;

    //adds another point
    quiz1.addScore(totNumb);
    // prints
    System.out.println("\nYour result " + name + " are " + quiz1 + " and your average is : " + String.format("%6.2f", getAverage));
    
    /**
     * new student 
    */
    QuizCalculator quiz2 = new QuizCalculator();
        //set the values
    String name2 = "Robert Orangines";
    double totNumb2 = 23;
    double score2 = 152;
    double getAverage2 = score2 / totNumb2;
    
    //adds another point
    quiz2.addScore(totNumb);
    //prints
    System.out.println("\nYour result " + name2 + " are " + quiz2 + " and your average is : " + String.format("%6.2f", getAverage2));
    }
}
