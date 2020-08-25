package challenges.foodToDoor;


public class FoodOrderService {
    private OrderService orderService;

    public FoodOrderService( final OrderService orderService) {
        this.orderService = orderService;
    }
    public OrderDto process(OrderRequest orderRequest){
        boolean isOrdered = orderService.process(orderRequest.getClient(), orderRequest.getQuantity(), orderRequest.getItem(), orderRequest.getQuantityOrdered());
        if(isOrdered){
            System.out.println(orderRequest.getClient() + "thanks for shopping");
            return new OrderDto(orderRequest.getClient(), true);
        }else {
            System.out.println("The order has not been made, please try again later");
            return new OrderDto(orderRequest.getClient(), false);
        }
    }
}
