package challenges.foodToDoor;

public interface OrderService {
    boolean process (String client, double quantity, String item, double quantityOrdered);
}
