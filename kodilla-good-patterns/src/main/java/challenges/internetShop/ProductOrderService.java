package challenges.internetShop;

public class ProductOrderService {

    private InformationService informationService;
    private SaleService saleService;
    private SaleRepository saleRepository;

    public ProductOrderService(final InformationService informationService,
                               final SaleService saleService,
                               final SaleRepository saleRepository) {
        this.informationService = informationService;
        this.saleService = saleService;
        this.saleRepository = saleRepository;
    }

    public SaleOtd process(final SaleRequest saleRequest) {
        boolean isSold = saleService.sale(saleRequest.getUser(), saleRequest.getPrice(),
                saleRequest.getQuantity(), saleRequest.getItem());

        if (isSold) {
            informationService.inform(saleRequest.getUser());
            saleRepository.createSaleTransaction(saleRequest.getUser(), saleRequest.getItem(), saleRequest.getPrice(), saleRequest.getQuantity());
            return new SaleOtd(saleRequest.getUser(), true);
        } else {
            return new SaleOtd(saleRequest.getUser(), false);
        }
    }
}
