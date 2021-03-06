package challenges.foodToDoor2;

public class Wholesaler {
    public void prepareOrder(Order order) {

        if (order.getShop().equals("ExtraFoodShop")) {
            ExtraFoodShop extraFoodShop = new ExtraFoodShop(order.getItem(), order.getQuantity());
            extraFoodShop.process(order);
        } else if (order.getShop().equals("GlutenFreeShop")) {
            GlutenFreeShop glutenFreeShop = new GlutenFreeShop(order.getItem(), order.getQuantity());
            glutenFreeShop.process(order);
        } else if (order.getShop().equals("HealtyShop")) {
            HealthyShop healthyShop = new HealthyShop(order.getItem(), order.getQuantity());
            healthyShop.process(order);
        } else {
            System.out.println("We do not have this shop in database");
        }
    }
}
