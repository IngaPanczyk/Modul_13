package challenges.foodToDoor2;

public class Order {
    String shop;
    String item;
    double quantity;

    public Order(String shop, String item, double quantity) {
        this.shop = shop;
        this.item = item;
        this.quantity = quantity;
    }

    public String getShop() {
        return shop;
    }

    public String getItem() {
        return item;
    }

    public double getQuantity() {
        return quantity;
    }
}
