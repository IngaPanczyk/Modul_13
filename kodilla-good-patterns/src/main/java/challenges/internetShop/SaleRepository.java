package challenges.internetShop;

public interface SaleRepository {
    void createSaleTransaction(User user, String item, int price, int quantity);
}
