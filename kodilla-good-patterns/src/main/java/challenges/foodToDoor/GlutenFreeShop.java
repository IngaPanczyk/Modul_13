package challenges.foodToDoor;

public class GlutenFreeShop implements OrderService {
    String client;
    double quantity;
    String item;
    double quantityOrdered;

    public GlutenFreeShop(String client, double quantity, String item, double quantityOrdered) {
        this.client = client;
        this.quantity = quantity;
        this.item = item;
        this.quantityOrdered = quantityOrdered;
    }

    public String getClient() {
        return client;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getItem() {
        return item;
    }

    public double getQualityOrdered() {
        return quantityOrdered;
    }

    public boolean process(String client, double quantity, String item, double quantityOrdered) {
        if (quantity > 0) {
            System.out.println(client + " bought " + quantityOrdered + " of " + item);
            System.out.println("Your " + item +" will arrive in 10 days");
            return true;
        } else {
            System.out.println("You do not have enough" + item + " to fulfill your order");
            return false;
        }
    }
}
