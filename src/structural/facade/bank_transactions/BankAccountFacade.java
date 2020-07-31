package structural.facade.bank_transactions;

public class BankAccountFacade {
    private int accountNumber;
    private int securityCode;

    AccountNumberCheck acctChecker;
    SecurityCodeCheck securityChecker;
    TransactionsProcessor processor;
    WelcomeToBank welcome;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        acctChecker = new AccountNumberCheck();
        securityChecker = new SecurityCodeCheck();
        processor = new TransactionsProcessor();
        welcome = new WelcomeToBank();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {
        if (acctChecker.isAccountActive(getAccountNumber()) &&
                securityChecker.isSecurityCodeCorrect(getSecurityCode()) &&
                processor.isEnoughFunds(cashToGet)) {

            processor.withdrawCash(cashToGet);
            System.out.println("Transaction completed successfully \n");
        } else {
            System.out.println("Transaction failed \n");
        }
    }

    public void depositCash(double cashToDeposit) {
        if (acctChecker.isAccountActive(getAccountNumber()) &&
                securityChecker.isSecurityCodeCorrect(getSecurityCode())) {

            processor.depositCash(cashToDeposit);
            System.out.println("Transaction completed successfully \n");
        } else {
            System.out.println("Transaction failed \n");
        }
    }
}
