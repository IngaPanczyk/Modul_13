package challenges.foodToDoor;

public class OrderProcess {

    public void  orderProcess(OrderService orderService){
        FoodOrderService foodOrderService = new FoodOrderService(orderService);
        foodOrderService.process(new ShopRequest(orderService));
    }
}
