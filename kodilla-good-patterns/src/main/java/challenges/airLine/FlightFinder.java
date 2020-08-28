package challenges.airLine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FlightFinder {

    public void findFlightTo( FlightsMap listOfFlights,  City cityFrom) {
        listOfFlights.fillIn().entrySet().stream()
                .filter(x -> cityFrom.equals(x.getKey()))
                .map(x->x.getValue())
                .forEach(System.out::println);
    }

    public void findIndirectFlight( FlightsMap listOfFlights,  City cityTo) {
        listOfFlights.fillIn().entrySet().stream()
                .filter(x -> (x.getValue().contains(cityTo)))
                .map(x->x.getKey())
                .forEach(System.out::println);

    }

    public void findFlightFrom( FlightsMap listOfFlights,  City cityTo,  City cityFrom) {
        listOfFlights.fillIn().entrySet().stream()
                .filter(x -> (x.getValue().contains(cityTo)))
                .map(x->x.getKey())
                .filter(x -> (x.contains(cityFrom.toString())))
                .forEach(System.out::println);
    }
}


