package challenges.foodToDoor;

public class OrderRunner {
    public static void main(String[] args) {

        DataAdding dataAdding = new DataAdding();
        OrderProcess orderProcess = new OrderProcess();
        orderProcess.orderProcess(dataAdding.retrieveglutenFreeShop());
        orderProcess.orderProcess(dataAdding.retrieveExtraFoodShop());
        orderProcess.orderProcess(dataAdding.retrievegHealthyShop());

    }
}
