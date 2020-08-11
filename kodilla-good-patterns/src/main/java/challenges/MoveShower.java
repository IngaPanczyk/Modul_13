package challenges;

import java.util.Map;
import java.util.stream.Collectors;

public class MoveShower {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String result = movieStore.getMovies().entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .flatMap(list -> list.stream())
                .collect(Collectors.joining("!", "", ""));
        System.out.println(result);
    }
}
