package challenges.airLine;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightFinder {

    public void findFlightTo(FlightsMapFillIn listOfFlights, String cityFrom) {
        System.out.print("From " + cityFrom + " you can flight to: ");
        listOfFlights.fillIn().entrySet().stream()
                .filter(x -> cityFrom.equals(x.getKey()))
                .map(x -> x.getValue())
                .forEach(System.out::println);
    }

    public void findFlightFrom(FlightsMapFillIn listOfFlights, String cityTo) {
        System.out.println("To " + cityTo + " you can flight from: ");
        listOfFlights.fillIn().entrySet().stream()
                .filter(x -> (x.getKey().contains(cityTo)))
                .map(x -> x.getKey())
                .map(x ->x.toString())
                .forEach(System.out::println);


    }

    public void findIndirectFlight(FlightsMapFillIn listOfFlights, String cityTo, String cityFrom) {
        List listOfCityFrom = listOfFlights.fillIn().entrySet().stream()
                .filter(x -> cityFrom.equals(x.getKey()))
                .map(x -> x.getValue())
                .collect(Collectors.toList());

        //sprawdzenie
        System.out.println(listOfCityFrom);
        String city = "Wrocław";
        System.out.println("Czy zawiera " + listOfCityFrom.contains(city));

        System.out.println("From " + cityFrom + " you can flight to: " + cityTo + " with inter-probing in ");
        listOfFlights.fillIn().entrySet().stream()
                .filter(x -> (x.getValue().contains(cityTo)))
                .map(x -> x.getKey())
                .filter(x -> (listOfCityFrom.contains(x)))
                .forEach(System.out::println);
    }
}


