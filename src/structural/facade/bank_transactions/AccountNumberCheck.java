package structural.facade.bank_transactions;

public class AccountNumberCheck {

    private int accountNumber = 123123;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean isAccountActive(int accntNumberToCheck) {
        if (accntNumberToCheck == getAccountNumber()) {
            return true;
        } else {
            return false;
        }
    }
}
