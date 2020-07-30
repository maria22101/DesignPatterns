package behavioral.mediator.stock_exchange;

public class BrokerTwo extends Colleague{

    public BrokerTwo(Mediator mediator) {
        super(mediator);
        System.out.println("BrokerTwo signed up for the stock exchange \n");
    }
}
