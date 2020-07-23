package structural.facade.bank_transactions;

public class SecurityCodeCheck {

    private int securityCode = 456;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isSecurityCodeCorrect(int securityCodeEntered) {
        if (securityCodeEntered == getSecurityCode()) {
            return true;
        } else {
            return false;
        }
    }
}
