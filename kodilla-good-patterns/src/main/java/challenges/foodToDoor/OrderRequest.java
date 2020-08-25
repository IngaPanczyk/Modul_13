package challenges.foodToDoor;

public class OrderRequest {
    private String client;
    private String item;
    private double quantity;
    private double quantityOrdered;

    public OrderRequest(String client, String item, double quantity) {
        this.client = client;
        this.item = item;
        this.quantity = quantity;
    }

    public String getClient() {

        return client;
    }

    public String getItem() {
        return item;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getQuantityOrdered() {
        return quantityOrdered;
    }
}
