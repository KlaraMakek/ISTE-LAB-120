/**
 * Travel cost
 * @author Klara Makek
 * @version 28.11.2022.
 * Course: ISTE-120
 * LAB 12
 */
/************** JAVADOC ************************/
public class TrainTravelCost implements TravelCost {
    private double duration;
    private double trainFare;
    private String destination;

    public TrainTravelCost(double duration, double trainFare, String destination) {
        this.duration = duration;
        this.trainFare = trainFare;
        this.destination = destination;
    }

    @Override
    public double getDuration() {
        return duration;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public double getTotalCost() {
        return trainFare + AGENT_FEE;
    }

    @Override
    public double getLodgingCost() {
        return 0;
    }
    @Override
    public String toString(){
        return String.format("Train travel to %s will take %.2f hours and cost $%,.2f.", getDestination(), getDuration(), getTotalCost());
    }

}
