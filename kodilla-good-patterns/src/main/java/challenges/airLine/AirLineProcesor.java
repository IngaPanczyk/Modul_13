package challenges.airLine;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class AirLineProcesor {
    public static void main(String[] args) {
        //zrobić z tego OTD???
        City cityFrom = new City("Kraków");
        City cityTo = new City("Zadar");
        //Zrobić z tego jedną metode
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightTo(new FlightsMapFillIn(new HashMap()), cityFrom.getCity());
        flightFinder.findFlightFrom(new FlightsMapFillIn(new HashMap()), cityTo.getCity());
        flightFinder.findIndirectFlight(new FlightsMapFillIn(new HashMap()), cityTo.getCity(), cityFrom.getCity());


/*        List<String> fromKrakow = new LinkedList<>();


        fromKrakow.add("Warszawa");
        fromKrakow.add("Wrocław");
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
        fromRzeszów.add("Wrocław");

        Map<String, List> listOfFlights1 = new HashMap<>();
        listOfFlights1.put("Kraków", fromKrakow);
        listOfFlights1.put("Wrocław", fromWroclaw);
        listOfFlights1.put("Rzeszów", fromRzeszów);

        listOfFlights1.entrySet().stream()
                .filter(x -> (x.getValue().contains("Zadar")))
                .map(x -> x.getKey())
                .filter(x -> (fromKrakow.contains(x)))
                .forEach(System.out::println);


                //.collect(Collectors.toSet());
        //System.out.println(flightSet);
*//*        int n=0;
        //nie dochodzę do 4 elementu

        for (String x : flightSet) {
            if (x == (fromKrakow.get(n))) {
                //System.out.println("To jest to miasto: " + x);
            }
            n++;
        }
        while (n<fromKrakow.size()){
            if(flightSet.contains("Wrocław"*//**//*fromKrakow.get(n)*//**//*)){
                System.out.println(fromKrakow.get(n));
                n++;
            }else {
                n++;
            }
        }*//*
        //System.out.println(fromKrakow.get(3));
                //.map(x -> (x.equals("Wrocław")))
                //.forEach(System.out::println);


//Podaje skąd lata
        listOfFlights1.entrySet().stream()
                .filter(x -> "Kraków".equals(x.getKey()))
                .map(x -> x.getValue())
                .forEach(System.out::println);

//Wyszukuje dokąd lata
        listOfFlights1.entrySet().stream()
                .filter(x -> (x.getValue().contains("Kraków")))
                .map(x -> x.getKey())
                .forEach(System.out::println);
//Szuka połączeń z przesiadką
        listOfFlights1.entrySet().stream()
                .filter(x -> (x.getValue().contains("Zadar")))
                .map(x -> x.getKey())
                .filter(x -> (fromKrakow.contains(x)))
                //.filter(x -> (x.getKey().equals(fromKrakow.get(3))))
                //Odfiltrowuje te miasta-klucze, do których mogę polecieć z Rzeszowa
               // .filter(x ->(x.contains(fromKrakow.toString())))
                //tworzę listę tych miast z których lata się do Zadaru
                .collect(toList())
                .forEach(System.out::println);




                //.filter(x -> (x.getKey().contains("Kraków")))
                //.map(x -> x.getValue())
                //.forEach(System.out::println);*/

    }

}
