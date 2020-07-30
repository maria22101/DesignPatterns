package behavioral.mediator.stock_exchange;

public class StockExchange {

    public static void main(String[] args) {

        StockMediator nyse = new StockMediator();
        Colleague brokerOne = new BrokerOne(nyse);
        Colleague brokerTwo = new BrokerTwo(nyse);

        brokerOne.saleOffer("Microsoft", 100);
        brokerOne.saleOffer("Google", 60);
        brokerOne.saleOffer("SAP", 12);

        brokerTwo.buyOffer("Google", 60);
        brokerTwo.buyOffer("Tesla", 5);
        brokerTwo.saleOffer("SpaceX", 8);

        brokerOne.buyOffer("SpaceX", 8);

        nyse.printStockSellOffers();
        nyse.printStockBuyOffers();
    }
}
