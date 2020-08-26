package challenges.foodToDoor;

public class ShopsRetrieve {
    ExtraFoodShop extraFoodShop;
    HealthyShop healthyShop;
    GlutenFreeShop glutenFreeShop;

    public ExtraFoodShop retrieveExtraFoodShop() {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("Jan Kowalski", 12, "0004", 11);
        return extraFoodShop;
    }

    public GlutenFreeShop retrieveglutenFreeShop() {
        GlutenFreeShop healthyShop = new GlutenFreeShop("Jan Kowalski", 12, "0004", 11);
        return healthyShop;
    }

/*    public HealthyShop retrieveHealtyShop() {
        HealthyShop glutenFreeShop = new HealthyShop("Jan Kowalski", 12, "0004", 11);
        return glutenFreeShop;
    }*/
}
