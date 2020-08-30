package challenges.airLine;


import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    public void findFlightTo(FlightsMapFillIn listOfFlights, String cityFrom) {
        System.out.println("From " + cityFrom + " you can flight to: ");
        listOfFlights.fillIn().entrySet().stream()
                .filter(x -> cityFrom.equals(x.getKey()))
                .flatMap(x -> x.getValue().stream())
                .forEach(System.out::println);
    }

    public void findFlightFrom(FlightsMapFillIn listOfFlights, String cityTo) {
        System.out.println("To " + cityTo + " you can flight from: ");
        listOfFlights.fillIn().entrySet().stream()
                .filter(x -> (x.getValue().contains(cityTo)))
                .map(x -> x.getKey())
                .forEach(System.out::println);
    }
    public void findIndirectFlight(FlightsMapFillIn listOfFlights, String cityTo, String cityFrom) {
        System.out.println("From " + cityFrom + " you can flight to: " + cityTo + " with inter-probing in ");
        List list = listOfFlights.fillIn().entrySet().stream()
                .filter(x -> (x.getValue().contains(cityFrom)))
                .map(x -> x.getKey())
                .collect(Collectors.toList());

        listOfFlights.fillIn().entrySet().stream()
                .filter(x -> cityFrom.equals(x.getKey()))
                .flatMap(x -> x.getValue().stream())
                .filter(x -> list.contains(x))
                .forEach(System.out::println);

    }
}


