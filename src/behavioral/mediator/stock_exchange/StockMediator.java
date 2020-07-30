package behavioral.mediator.stock_exchange;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StockMediator implements Mediator{
    private List<Colleague> colleagues;
    private List<StockOffer> stockBuyOffers;
    private List<StockOffer> stockSellOffers;

    private int colleaguesNumber = 0;

    public StockMediator() {
        colleagues = new ArrayList<>();
        stockBuyOffers = new ArrayList<>();
        stockSellOffers = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
        colleaguesNumber++;
        colleague.setColleagueCode(colleaguesNumber);
    }

    @Override
    public void saleOffer(String companyWhichSharesBeingTraded,
                          int sharesNumber,
                          int colleagueCode) {

        boolean stockSold = false;

        Optional<StockOffer> matchingBuyOffer = stockBuyOffers
                .stream()
                .filter(offer ->
                        offer.getCompanyWhichSharesBeingTraded().equals(companyWhichSharesBeingTraded) &&
                        offer.getNumberOfShares() == sharesNumber)
                .findFirst();

        if(matchingBuyOffer.isPresent()) {
            stockSold = true;
            System.out.println(sharesNumber + " shares of " + companyWhichSharesBeingTraded +
                    " sold to colleague with code " + matchingBuyOffer.get().getColleagueCode());
            stockBuyOffers.remove(matchingBuyOffer.get());
        }

        if(!stockSold) {
            System.out.println(sharesNumber + " shares of " + companyWhichSharesBeingTraded +
                    " added to future stock sell offers");
            stockSellOffers.add(new StockOffer(
                    sharesNumber,
                    companyWhichSharesBeingTraded,
                    colleagueCode));
        }
    }

    @Override
    public void buyOffer(String companyWhichSharesBeingTraded,
                         int sharesNumber,
                         int colleagueCode) {

        boolean stockBought = false;

        Optional<StockOffer> matchingSellOffer = stockSellOffers
                .stream()
                .filter(offer ->
                        offer.getCompanyWhichSharesBeingTraded().equals(companyWhichSharesBeingTraded) &&
                        offer.getNumberOfShares() == sharesNumber)
                .findFirst();

        if(matchingSellOffer.isPresent()) {
            stockBought = true;
            System.out.println(sharesNumber + " shares of " + companyWhichSharesBeingTraded +
                    " bought by colleague with code " + colleagueCode);
            stockSellOffers.remove(matchingSellOffer.get());
        }

        if(!stockBought) {
            System.out.println(sharesNumber + " shares of " + companyWhichSharesBeingTraded +
                    " added to future stock buy offers");
            stockBuyOffers.add(new StockOffer(
                    sharesNumber,
                    companyWhichSharesBeingTraded,
                    colleagueCode));
        }
    }

    public void printStockSellOffers() {
        System.out.println("\nStock for sale: ");
        stockSellOffers.forEach(offer -> System.out.println(offer.getNumberOfShares() + " shares of " +
                offer.getCompanyWhichSharesBeingTraded()));
    }

    public void printStockBuyOffers() {
        System.out.println("\nStock for buy: ");
        stockBuyOffers.forEach(offer -> System.out.println(offer.getNumberOfShares() + " shares of " +
                offer.getCompanyWhichSharesBeingTraded()));
    }
}
