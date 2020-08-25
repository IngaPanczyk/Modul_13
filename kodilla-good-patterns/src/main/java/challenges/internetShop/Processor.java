package challenges.internetShop;

public class Processor {

    public static void main(String[] args) {
        SaleRequestRetriver saleRequestRetriver = new SaleRequestRetriver();
        SaleRequest saleRequest = saleRequestRetriver.retrieve();
        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new GlassesSaleService(), new GrassesSaleRepository());
        productOrderService.process(saleRequest);
    }
}
