package behavioral.mediator.stock_exchange;

public abstract class Colleague {
    private Mediator mediator;
    private int colleagueCode;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.addColleague(this);
    }

    public void setColleagueCode(int colleagueCode) {
        this.colleagueCode = colleagueCode;
    }

    public void saleOffer(String companyWhichSharesBeingTraded,
                          int sharesNumber) {

        mediator.saleOffer(companyWhichSharesBeingTraded,
                sharesNumber, this.colleagueCode);
    }

    public void buyOffer(String companyWhichSharesBeingTraded,
                         int sharesNumber) {

        mediator.buyOffer(companyWhichSharesBeingTraded,
                sharesNumber, this.colleagueCode);
    }
}
