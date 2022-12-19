/**
 * Description: a simple quiz calculator
 * @author Klara Makek
 * @version 25.9.2022.
 * Course: ISTE-120
 * LAB- 03-3
 */
 /**************JAVADOC************************/
public class QuizCalculator {
    // Instance Variable
    private String name;
    private double totNumb;
    private double score;

    /**
     * sets Total number of answers to 0, and sum of the answers to 0
     */
    public QuizCalculator(){
        totNumb = 0;
        score = 0;
    }
    /**
     * adds another point to the student
     */
    public void addScore(double newScore){
         this.score += newScore;
    }
     /** gets the start value of the quiz average
     * @param amount the score
     */
    public double getAverage(){
        return this.score;
    }
    /**
     * get the total number of quiz's
     * @return to the TotNumb
     */
    public double totNumb(){
        return this.totNumb;
    }
    /**
     * get the name of the student
     * @return to the name
     */
    public String name(){
        return this.name;
    }
    /**
    * toString for printing
    */
    public String toString(){
        return "" + getAverage();
    }


}
