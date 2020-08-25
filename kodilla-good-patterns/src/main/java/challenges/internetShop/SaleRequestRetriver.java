package challenges.internetShop;

public class SaleRequestRetriver {

    public SaleRequest retrieve() {
        User user = new User("Inga", "Pańczyk", "login1");
        int price = 2;
        int quantity = 3;
        String item = "glasses MODEL:123";

        return (new SaleRequest(user, price, quantity, item));

    }


}
