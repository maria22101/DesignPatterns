package behavioral.mediator.stock_exchange;

public interface Mediator {

    public void saleOffer(String companyWhichSharesBeingTraded,
                          int sharesNumber,
                          int colleagueCode);

    public void buyOffer(String companyWhichSharesBeingTraded,
                         int sharesNumber,
                         int colleagueCode);

    public void addColleague(Colleague colleague);
}
