package challenges;

public class GrassesSaleRepository implements SaleRepository {

    public void createSaleTransaction(User user, String item, int price, int quantity) {
        System.out.println("User: " + user.getName() + ", price: "+ price + ", item: "+ item + ", quantity: " + quantity);
    }
}
