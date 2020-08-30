package challenges.airLine2;

import challenges.airLine.Flight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List <Flight> flightList = new ArrayList<>();
        Flight flight1 = new Flight("Wrocław", "Gdańsk");
        Flight flight2 = new Flight("Wrocław", "Warszawa");
        Flight flight3 = new Flight("Wrocław", "Rzeszów");
        Flight flight4 = new Flight("Wrocław", "Katowice");
        Flight flight5 = new Flight("Wrocław", "Zadar");
        Flight flight6 = new Flight("Wrocław", "Rzym");
        Flight flight7 = new Flight("Rzym", "Gdańsk");
        Flight flight8 = new Flight("Rzym", "Rzym");
        Flight flight9 = new Flight("Rzym", "Warszawa");
        Flight flight10 = new Flight("Rzym", "Nowy Jork");
        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);
        flightList.add(flight5);
        flightList.add(flight6);
        flightList.add(flight7);
        flightList.add(flight8);
        flightList.add(flight9);
        flightList.add(flight10);

        flightList.stream()
                //.map(x->x.getFrom())
                //.filter(x->x.getTo()=="Nowy Jork")
               // .map(x->x.toString())
                .forEach(System.out::println);


    }
}
