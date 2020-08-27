package challenges.foodToDoor;

public class DataAdding {

    public ExtraFoodShop retrieveExtraFoodShop() {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("Jan Kowalski", 12, "0004", 11);
        return extraFoodShop;
    }

    public GlutenFreeShop retrieveglutenFreeShop() {
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("Anna Nowak", 15, "LW34", 1);
        return glutenFreeShop;
    }

    public HealthyShop retrievegHealthyShop() {
        HealthyShop healthyShop = new HealthyShop("Zuzanna Kwiatkowska", 0, "ZPL120333", 1);
        return healthyShop;
    }

}
