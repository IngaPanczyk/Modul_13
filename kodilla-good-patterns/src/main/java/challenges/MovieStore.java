package challenges;

import java.util.*;
import java.util.stream.Collectors;

class MovieStore {
    private static final String IRON_MAN = "Iron Man";
    private static final String IRON_MAN_TRANS = "Żelazny Człowiek";
    private static final String AVENGERS = "Avengers";
    private static final String AVENGERS_TRANS = "Mściciele";
    private static final String FLASH = "Flash";
    private static final String FLASH_TRANS = "Błyskawica";

    public Map<String, List<String>> getMovies() {

        final List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add(IRON_MAN);
        ironManTranslations.add(IRON_MAN_TRANS);

        final List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add(AVENGERS);
        avengersTranslations.add(AVENGERS_TRANS);

        final List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add(FLASH);
        flashTranslations.add(FLASH_TRANS);

        final Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;

    }

}
