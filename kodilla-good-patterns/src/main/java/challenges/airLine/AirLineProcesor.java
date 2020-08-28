package challenges.airLine;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AirLineProcesor {
    public static void main(String[] args) {
        FlightsMap flightsMap = new FlightsMap();
       City city = new City("Kraków");
       City cityTo = new City("Zadar");
        FlightFinder flightFinder = new FlightFinder();
        flightsMap.fillIn();
        flightFinder.findFlightTo(flightsMap, city);
        //flightFinder.findIndirectFlight(flightsMap,city);
        //flightFinder.findFlightFrom(flightsMap,cityTo,city);


        List<String> fromKrakow = new LinkedList<>();
        fromKrakow.add("Warszawa");
        fromKrakow.add("Mediolan");
        fromKrakow.add("Rzym");
        List<String> fromWroclaw = new LinkedList<>();
        fromWroclaw.add("Warszawa");
        fromWroclaw.add("Mediolan");
        fromWroclaw.add("Rzym");
        fromWroclaw.add("Kraków");
        fromWroclaw.add("Zadar");
        List<String> fromRzeszów = new LinkedList<>();
        fromRzeszów.add("Warszawa");
        fromRzeszów.add("Mediolan");
        fromRzeszów.add("Rzym");
        fromRzeszów.add("Kraków");
        fromRzeszów.add("Zadar");


        Map<String, List> listOfFlights = new HashMap<>();
        listOfFlights.put("Kraków", fromKrakow);
        listOfFlights.put("Wroclaw", fromWroclaw);
        listOfFlights.put("Rzeszów", fromRzeszów);
//Podaje skąd lata
        listOfFlights.entrySet().stream()
                .filter(x -> "Kraków".equals(x.getKey()))
                .map(x->x.getValue())
                .forEach(System.out::println);
//Wyszukuje dokąd lata
        listOfFlights.entrySet().stream()
                .filter(x -> (x.getValue().contains("Kraków")))
                .map(x->x.getKey())
                .forEach(System.out::println);
//Szuka połączeń z przesiadką
        listOfFlights.entrySet().stream()
                .filter(x -> (x.getValue().contains("Zadar")))
                .map(x->x.getKey())
                .filter(x -> (x.contains("Kraków")))
                .forEach(System.out::println);

    }

}
