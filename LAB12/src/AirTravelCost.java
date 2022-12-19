import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Travel cost
 * @author Klara Makek
 * @version 28.11.2022.
 * Course: ISTE-120
 * LAB 12
 */
/************** JAVADOC ************************/
public class AirTravelCost implements TravelCost {
    private String departureDate;
    private String arrivalDate;
    private String departureTime;
    private String arrivalTime;
    private String destination;
    private double travelFare;
    private double hotelCost;

    public AirTravelCost(String departureDate, String arrivalDate, String departureTime, String arrivalTime,
            String destination, double travelFare, double hotelCost) {
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.destination = destination;
        this.travelFare = travelFare;
        this.hotelCost = hotelCost;
    }

    @Override
    public double getDuration() {
        LocalDateTime departure = LocalDateTime.parse(departureDate + " " + departureTime,
                DateTimeFormatter.ofPattern("yyyyMMdd HHmm"));
        LocalDateTime arrival = LocalDateTime.parse(arrivalDate + " " + arrivalTime,
                DateTimeFormatter.ofPattern("yyyyMMdd HHmm"));

        long durationMillis = Duration.between(departure, arrival).toMillis();
        return (double) (durationMillis / 60000 / 60);
    }

    @Override
    public double getTotalCost() {
        return travelFare + AGENT_FEE + getLodgingCost();
    }

    @Override
    public double getLodgingCost() {
        return hotelCost * Math.floor(getDuration() / 24);
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public String toString(){
        return String.format("Air travel to %s will take %.2f hours and cost $%,.2f.", getDestination(), getDuration(), getTotalCost());
    }
}