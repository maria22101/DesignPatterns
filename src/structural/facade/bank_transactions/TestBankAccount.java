package structural.facade.bank_transactions;

public class TestBankAccount {

    public static void main(String[] args) {

        BankAccountFacade accessingBank = new BankAccountFacade(123123, 456);

        accessingBank.withdrawCash(50.00);

        accessingBank.withdrawCash(100.00);

        accessingBank.depositCash(200.00);

    }
}
