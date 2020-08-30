package challenges.foodToDoor2;

public class ExtraFoodShop implements OrderService {
    String item;
    double quantity;

    public ExtraFoodShop(String item, double quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public void process(Order order) {
        System.out.println("!Welcome in " + order.getShop() + "!");
        System.out.println("You bought " + item);
        System.out.println("We have started processing your order");
    }
}