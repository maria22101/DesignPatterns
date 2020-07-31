package behavioral.state.atm;

public class ATMMachine {

    ATMState hasCard;
    ATMState hasNoCard;
    ATMState hasCorrectPin;
    ATMState hasNoCash;

    ATMState atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine() {
        this.hasCard = new HasCard(this);
        this.hasNoCard = new HasNoCard(this);
        this.hasCorrectPin = new HasCorrectPin(this);
        this.hasNoCash = new HasNoCash(this);

        atmState = hasNoCard;

        if(cashInMachine <= 0) {
            atmState = hasNoCash;
        }
    }

    public void setAtmState(ATMState newAtmState) {
        atmState = newAtmState;
    }

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void requestCash(int cashToWithDraw) {
        atmState.requestCash(cashToWithDraw);
    }

    public void enterPin(int pinEntered) {
        atmState.enterPin(pinEntered);
    }

    public ATMState getHasCardState() {
        return hasCard;
    }

    public ATMState getHasNoCardState() {
        return hasNoCard;
    }

    public ATMState getHasCorrectPinState() {
        return hasCorrectPin;
    }

    public ATMState getHasNoCashState() {
        return hasNoCash;
    }
}
