package challenges;

public class SaleRequest {

    User user;
    int price;
    int quantity;
    String item;

    public SaleRequest(User user, int price, int quantity, String item) {
        this.user = user;
        this.price = price;
        this.quantity = quantity;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getItem() {
        return item;
    }
}
