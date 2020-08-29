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
        City e = (City) o;
        return this.city.equals(e.city);
    }
    @Override
    public int hashCode() {
        if(city.length()>5)
            return 1;
        if (city.length()>6) {
            return 2;
        }else
            return 0;
    }
}
