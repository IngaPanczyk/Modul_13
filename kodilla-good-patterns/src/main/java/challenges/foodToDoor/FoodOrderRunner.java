package challenges.foodToDoor;

import java.util.function.BiConsumer;

public class FoodOrderRunner {
    public static void main(String[] args) {


        ExtraFoodShop extraFoodShop = new ExtraFoodShop("Kowalski", 12, "111",1);
        FoodOrderService foodOrderService = new FoodOrderService(extraFoodShop);
        foodOrderService.process(new ShopRequest(extraFoodShop));

    }
}
