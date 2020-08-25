package challenges.foodToDoor;

public class GlutenFreeShop {
    public boolean process(String client, double quantity, String item, double quantityOrdered) {
        if (quantity > 0) {
            System.out.println(client + " bought " + quantityOrdered + " of " + item);
            System.out.println("Your order will arrive in 5 days");
            return true;
        } else {
            System.out.println("e do not have enough" + item + " to fulfill your order");
            return false;
        }
    }
}
