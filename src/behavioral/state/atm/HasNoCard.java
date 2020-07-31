package behavioral.state.atm;

public class HasNoCard implements ATMState{

    //A context we are going to work with
    ATMMachine atmMachine;

    public HasNoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please enter a PIN");
        atmMachine.setAtmState(atmMachine.getHasCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("Enter a card first");
    }

    @Override
    public void enterPin(int pinEntered) {
        System.out.println("Enter a card first");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter a card first");
    }
}
