package behavioral.state.atm;

public interface ATMState {

    void insertCard();

    void ejectCard();

    void enterPin(int pinEntered);

    void requestCash(int cashToWithdraw);
}
