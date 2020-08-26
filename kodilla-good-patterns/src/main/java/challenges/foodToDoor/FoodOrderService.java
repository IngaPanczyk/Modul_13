package challenges.foodToDoor;


public class FoodOrderService {
    private OrderService orderService;

    public FoodOrderService( final OrderService orderService) {
        this.orderService = orderService;
    }
    public OrderDto process( final ShopRequest shopRequest){
        boolean isOrdered = orderService.process(orderService.getClient(),orderService.getQuantity(), orderService.getItem(), orderService.getQualityOrdered() /*shopRequest.getClient(), shopRequest.getQuantity(), shopRequest.getItem(), shopRequest.getQuantityOrdered()*/);
        if(isOrdered){
            System.out.println("thanks for shopping");
            return new OrderDto(orderService.getClient(), true);
        }else {
            System.out.println("The order has not been made, please try again later");
            return new OrderDto(orderService.getClient(), false);
        }
    }
}
