import java.util.ArrayList;

/**
 * Travel cost
 * @author Klara Makek
 * @version 28.11.2022.
 * Course: ISTE-120
 * LAB 12
 */
/************** JAVADOC ************************/
public class TestCarTravelCost {
    public static void main(String[] args) {
        TravelCost cheep = null;
        TravelCost shortest = null;

        if (args.length < 3) {
            System.out.println("ERROR: Invalid number of command line arguments.");
            System.exit(0);
        }
        CarTravelCost test = new CarTravelCost(Integer.parseInt(args[0]), Double.parseDouble(args[1]), args[2]);
        // System.out.println(test.toString());

        TrainTravelCost test2 = new TrainTravelCost(Double.parseDouble(args[3]), Double.parseDouble(args[4]), args[2]);
        // System.out.println(test2.toString());

        AirTravelCost test3 = new AirTravelCost(args[6], args[7], args[8], args[9], args[2],
                Double.parseDouble(args[5]), Double.parseDouble(args[1]));
        // System.out.println(test3.toString());

        ArrayList<TravelCost> lista = new ArrayList<TravelCost>();
        lista.add(test);
        lista.add(test2);
        lista.add(test3);

        for (TravelCost l : lista) {
            System.out.println(l);
            if (cheep == null || l.getTotalCost() < cheep.getTotalCost()) {
                cheep = l;
            }
            if (shortest == null || l.getDuration() < shortest.getDuration()) {
                shortest = l;
            }
        }
        System.out.println("Cheapest price: " + cheep.toString());
        System.out.println("Shortest Duration: " + shortest.toString());
    }

}
