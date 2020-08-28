package challenges.airLine;

public class City {
    String city;


    public City(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
    @Override
    public boolean equals(Object o) {
        final City e = (City) o;
        return this.city.equals(e.city);
    }
    @Override
    public int hashCode() {

        return city.length();
    }
}
