/**
 * Description: a simple calculator
 * @author Klara Makek
 * @version 25.9.2022.
 * Course: ISTE-120
 * LAB- 03-2
 */
 /**************JAVADOC************************/
 public class TestCalculator2 {
    public static void main(String[] args) {
            // setting the values
            double x1=1;
            double x2=2;
            double y1=3;
            double y2=4;

        Calculator numerator = new Calculator();
    	numerator.add(y2);
        numerator.subtract(y1); // numerator now holds y2 – y1
        System.out.println("\nSubtraction: " + (y2-y1));


        Calculator denominator = new Calculator();
        denominator.add(x2);
        denominator.subtract(x1); // numerator now holds x2 – x1

        System.out.println("\nSubtraction 2: " + (x2-x1));

        numerator.dev(denominator.getAccumulator()); // divide the denominator

        //BMI calculator
        Calculator bmi = new Calculator();
        //setting the values
        double a = 703;
        double W = 113;
        double H = 63.7795;
        
        // the calculations
        bmi.add(a);
        bmi.mutl(W);
        bmi.dev(H*H);

        //print...
        System.out.println("\nYour BMI is: " + ((a*W)/(H*H)));


    }
}

