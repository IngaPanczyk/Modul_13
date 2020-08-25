package challenges.foodToDoor;

public class FoodOrderRunner {
    public static void main(String[] args) {
        ShopsRetrieve shopsRetrieve = new ShopsRetrieve();
        OrderRequest orderRequest = new OrderRequest();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        HealthyShop healthyShop = new HealthyShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        FoodOrderService foodOrderService = new FoodOrderService(new OrderService());

        );

                foodOrderService.process();










    }
}
