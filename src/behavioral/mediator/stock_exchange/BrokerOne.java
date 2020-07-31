package behavioral.mediator.stock_exchange;

public class BrokerOne extends Colleague {

    public BrokerOne(Mediator mediator) {
        super(mediator);
        System.out.println("BrokerOne signed up for the stock exchange \n");
    }
}
