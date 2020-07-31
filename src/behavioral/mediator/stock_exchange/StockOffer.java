package behavioral.mediator.stock_exchange;

public class StockOffer {
    private int numberOfShares = 0;
    private String companyWhichSharesBeingTraded = "";
    private int colleagueCode = 0;

    public StockOffer(int numberOfShares,
                      String companyWhichSharesBeingTraded,
                      int colleagueCode) {

        this.numberOfShares = numberOfShares;
        this.companyWhichSharesBeingTraded = companyWhichSharesBeingTraded;
        this.colleagueCode = colleagueCode;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public String getCompanyWhichSharesBeingTraded() {
        return companyWhichSharesBeingTraded;
    }

    public int getColleagueCode() {
        return colleagueCode;
    }
}
