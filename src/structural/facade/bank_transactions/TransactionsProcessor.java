package structural.facade.bank_transactions;

public class TransactionsProcessor {
    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public boolean isEnoughFunds(double cashToWithdrawal) {
        if (cashToWithdrawal > getCashInAccount()) {
            return false;
        } else {
            return true;
        }
    }

    public void withdrawCash(double cashWithdrawn) {
        if (isEnoughFunds(cashWithdrawn)) {
            cashInAccount -= cashWithdrawn;
            System.out.println("Withdrawal complete. Current balance: " + getCashInAccount());
        } else {
            System.out.println("Error: not enough money");
            System.out.println("Current balance: " + getCashInAccount());
        }
    }

    public void depositCash(double cashDeposited) {
        cashInAccount += cashDeposited;
        System.out.println("Deposit complete. Current balance: " + getCashInAccount());
    }
}
