package challenges.foodToDoor2;

public class OrderRunner {
    public static void main(String[] args) {
        Order order = new Order("ExtraFoodShop", "Tomato", 14);
        Wholesaler wholesaler = new Wholesaler();
        wholesaler.prepareOrder(order);

        Order order1 = new Order("GlutenFreeShop", "Pizza", 2);
        Wholesaler wholesaler1 = new Wholesaler();
        wholesaler1.prepareOrder(order1);

        Order order2 = new Order("HealtyShop", "Wather", 100);
        Wholesaler wholesaler2 = new Wholesaler();
        wholesaler2.prepareOrder(order2);

        Order order3 = new Order("HealtyShops", "Wather", 100);
        Wholesaler wholesaler3 = new Wholesaler();
        wholesaler3.prepareOrder(order3);
    }
}
