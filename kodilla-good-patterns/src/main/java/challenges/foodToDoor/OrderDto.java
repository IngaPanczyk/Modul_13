package challenges.foodToDoor;

public class OrderDto {
    public String client;
    boolean isOrdered;

    public OrderDto(String client, boolean isOrdered) {
        this.client = client;
        this.isOrdered = isOrdered;
    }

    public String getClient() {
        return client;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
