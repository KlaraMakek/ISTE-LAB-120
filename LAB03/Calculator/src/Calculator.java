/**
 * Description: a simple calculator
 * @author Klara Makek
 * @version 25.9.2022.
 * Course: ISTE-120
 * LAB- 03-1
 */
 /**************JAVADOC************************/
public class Calculator {
 
    // Instance Variable
    private double accumulator;

    /**
     * sets the calculator to a 0, aka start number
     */
    public Calculator(){
        accumulator = 0;
    }

    /** gets the start value of the calculator
     * @param amount the amount of the calc
     */
    public double getAccumulator(){
        return this.accumulator;
    }

    // addition
    public void add(double x){
        this.accumulator += x;
    }
    // subtraction
    public void subtract(double x){
        this.accumulator -= x;
    }
    //multiplier
    public void mutl(double x){
        this.accumulator *= x;
    }
    //divided
    public void dev(double x){

        if (x == 0.0) {
            System.out.println("ERROR");
        }
        else {
            this.accumulator = accumulator / x;
            }
    }
    //sets the calculator back to 0
    public void clear(double x){
        this.accumulator = 0;
    }

    // toString for printing
    public String toString(){
        return "" + accumulator;

    }

}
