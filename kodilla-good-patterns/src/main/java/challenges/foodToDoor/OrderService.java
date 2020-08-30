package challenges.foodToDoor;

public interface OrderService {
    boolean process(String client, double quantity, String item, double quantityOrdered);

    String getClient();

    double getQuantity();

    String getItem();

    double getQualityOrdered();
}
