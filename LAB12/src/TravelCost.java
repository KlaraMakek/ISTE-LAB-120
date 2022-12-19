/**
 * Travel cost
 * @author Klara Makek
 * @version 28.11.2022.
 * Course: ISTE-120
 * LAB 12
 */
/************** JAVADOC ************************/
public interface TravelCost {
    public static final double AGENT_FEE = 10.00;

    public abstract double getDuration();

    public abstract double getTotalCost();

    public abstract double getLodgingCost();

    public abstract String getDestination();

    public abstract String toString();

}
