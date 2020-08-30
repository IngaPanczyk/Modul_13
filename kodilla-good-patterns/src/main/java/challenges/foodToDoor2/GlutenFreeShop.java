package challenges.foodToDoor2;


public class GlutenFreeShop implements OrderService {
    String item;
    double quantity;

    public GlutenFreeShop(String item, double quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public void process(Order order) {
        System.out.println("!Welcome in " + order.getShop() + "!");
        System.out.println("You ordered " + quantity + " of " + item);
        System.out.println("We will send the order today");
    }
}

