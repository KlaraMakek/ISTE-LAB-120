/**
 * Travel cost
 * @author Klara Makek
 * @version 28.11.2022.
 * Course: ISTE-120
 * LAB 12
 */
/************** JAVADOC ************************/
public class CarTravelCost implements TravelCost {
    private int numMiles;
    private double hotelCost;
    private String destination;

    public CarTravelCost(int numMiles, double hotelCost, String destination) {
        this.numMiles = numMiles;
        this.hotelCost = hotelCost;
        this.destination = destination;

    }

    @Override
    public double getDuration() {
        double numHours = (double) numMiles / 65;
        return numHours;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public double getLodgingCost() {
        return Math.floor(getDuration() / 8) * hotelCost;
    }

    @Override
    public double getTotalCost() {
        return (numMiles * 0.45) + getLodgingCost() + AGENT_FEE;
    }

    @Override
    public String toString() {
        return String.format("Car travel to %s will take %.2f hours and cost $%,.2f", getDestination(), getDuration(),
                getTotalCost());
    }
}
