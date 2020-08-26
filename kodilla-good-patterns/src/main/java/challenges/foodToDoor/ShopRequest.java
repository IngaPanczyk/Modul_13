package challenges.foodToDoor;

public class ShopRequest {

    OrderService orderService;

   public ShopRequest(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderService getOrderService() {
        return orderService;
    }


    /*String client = orderService.getClient();
    double quantity;
    String item;
    double quantityOrdered;

    public ShopRequest(client*//*, double quantity, String item, double quantityOrdered*//*) {
        this.client = client;
        this.quantity = quantity;
        this.item = item;
        this.quantityOrdered = quantityOrdered;
    }

    public String getClient() {
        return client;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getItem() {
        return item;
    }

    public double getQuantityOrdered() {
        return quantityOrdered;
    }*/
}
