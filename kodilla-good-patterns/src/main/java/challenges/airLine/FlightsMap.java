package challenges.airLine;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FlightsMap {

    public Map<String, List> fillIn() {

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

        return listOfFlights;
    }
}
