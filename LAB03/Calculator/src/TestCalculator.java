/**
 * Description: a simple calculator
 * @author Klara Makek
 * @version 25.9.2022.
 * Course: ISTE-120
 * LAB- 03-1
 */
 /**************JAVADOC************************/
public class TestCalculator {
    public static void main(String[] args) {
        //Calculator, instantiate calculator object
        Calculator calc1 = new Calculator();
        
        // setting the values for my weight
        double myFat = 113;
        calc1.add(myFat);
        calc1.mutl(0.453952);
        // printing
        System.out.println("\nMy weight is " + myFat + "lb = " + calc1 + "kg");

        // setting the values
        double x = 12;
        double y = 45;
        double z = 0;

        //setting the values of the people and square mile in NY state
        double sqm = 47126;
        double ppl = 20215751;

        //setting the value of the pie
        double a = 22;
        double b = 7;

        // addition
        calc1.add(x);
        calc1.add(y);
        // printing
        System.out.println("\nAddition " + (x + y));

        // subtraction
        calc1.subtract(y);
        // printing
        System.out.println("\nSuptraction " + (x-y));

        //multiplication
        calc1.mutl(y);
        // printing
        System.out.println("\nMultiplier " + (x*y));

        //divider
        calc1.dev(y);
        // printing
        System.out.println("\nDivider 1 " + (x/y));

        // printing
        System.out.println("\nDivider 2:"); //Setting print before for good looking form
        calc1.dev(z);
        
        // divider for the pie
        calc1.add(a);
        calc1.dev(b);
        // printing
        System.out.println("\nDivider 3: " + (a/b));

        // divider for the NY
        calc1.add(ppl);
        calc1.dev(sqm);
        // printing
        System.out.println("\nPeople per square mile in New York State: " + String.format("%6.2f", (ppl/sqm)));

        /* 
        //printing.....
        System.out.println("Calculator:" + calc1);
        */
    }
}
