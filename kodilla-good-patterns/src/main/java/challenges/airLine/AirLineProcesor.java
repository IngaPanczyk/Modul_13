package challenges.airLine;

import java.util.*;


public class AirLineProcesor {
    public static void main(String[] args) {

        City cityFrom = new City("Kraków");
        City cityTo = new City("Zadar");

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightTo(new FlightsMapFillIn(new HashMap()), cityFrom.getCity());
        flightFinder.findFlightFrom(new FlightsMapFillIn(new HashMap()), cityTo.getCity());
        flightFinder.findIndirectFlight(new FlightsMapFillIn(new HashMap()), cityTo.getCity(), cityFrom.getCity());
    }

}
