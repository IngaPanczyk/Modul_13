package challenges.airLine;

import java.util.*;
import java.util.stream.Collectors;

public class AirLineProcesor {
    public static void main(String[] args) {
        //zrobić z tego OTD???
        City cityFrom = new City("Kraków");
        City cityTo = new City("Zadar");
        //Zrobić z tego jedną metode
        FlightFinder flightFinder = new FlightFinder();
        //flightFinder.findFlightTo(new FlightsMapFillIn(new HashMap()), cityFrom.getCity());
        //flightFinder.findFlightFrom(new FlightsMapFillIn(new HashMap()), cityTo.getCity());
        //flightFinder.findIndirectFlight(new FlightsMapFillIn(new HashMap()), cityTo.getCity(), cityFrom.getCity());


        List<String> fromKrakow = new LinkedList<>();
        fromKrakow.add("Warszawa");
        fromKrakow.add("Mediolan");
        fromKrakow.add("Rzym");
        fromKrakow.add("Wrocław");
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


        Map<String, List> listOfFlights1 = new HashMap<>();
        listOfFlights1.put("Kraków", fromKrakow);
        listOfFlights1.put("Wroclaw", fromWroclaw);
        listOfFlights1.put("Rzeszów", fromRzeszów);
//Podaje skąd lata
        /*listOfFlights1.entrySet().stream()
                .filter(x -> "Kraków".equals(x.getKey()))
                .map(x -> x.getValue())
                .forEach(System.out::println);*/

//Wyszukuje dokąd lata
        /*listOfFlights1.entrySet().stream()
                .filter(x -> (x.getValue().contains("Kraków")))
                .map(x -> x.getKey())
                .forEach(System.out::println);*/
//Szuka połączeń z przesiadką
        listOfFlights1.entrySet().stream()
                //te które zawierają w wartościach ZADAR
                .filter(x -> (x.getValue().contains("Zadar")))
                .map(x -> x.getValue())
                .collect(Collectors.toList())
                .stream()
                .forEach(System.out::println);


                //.filter(x -> (x.getKey().contains("Kraków")))
                //.map(x -> x.getValue())
                //.forEach(System.out::println);

    }

}
