package challenges.foodToDoor2;

public class HealthyShop implements OrderService {
    String item;
    double quantity;

    public HealthyShop(String item, double quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public void process(Order order) {
        System.out.println("!Welcome in " + order.getShop() + "!");
        System.out.println("You ordered " + item);
        System.out.println("We will send you " + quantity + "  bottles of " + item);
    }
}
