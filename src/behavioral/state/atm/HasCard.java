package behavioral.state.atm;

public class HasCard implements ATMState {

    //A context we are going to work with
    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't enter more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setAtmState(atmMachine.getHasNoCardState());
    }

    @Override
    public void enterPin(int pinEntered) {

        //just hypothetical check applied:
        if (pinEntered == 1234) {
            System.out.println("Correct PIN");
            atmMachine.correctPinEntered = true;
            atmMachine.setAtmState(atmMachine.getHasCorrectPinState());
        } else {
            System.out.println("Wrong PIN");
            atmMachine.correctPinEntered = false;
            System.out.println("Card ejected");
            atmMachine.setAtmState(atmMachine.getHasNoCardState());
        }
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter PIN first");
    }
}
