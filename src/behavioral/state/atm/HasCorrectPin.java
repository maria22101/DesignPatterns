package behavioral.state.atm;

public class HasCorrectPin implements ATMState {

    //A context we are going to work with
    ATMMachine atmMachine;

    public HasCorrectPin(ATMMachine atmMachine) {
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
        System.out.println("PIN already entered");
    }

    @Override
    public void requestCash(int cashToWithdraw) {

        if (cashToWithdraw > atmMachine.cashInMachine) {
            System.out.println("No sufficient cash amount available to serve your request");
            System.out.println("Card ejected");
            atmMachine.setAtmState(atmMachine.getHasNoCardState());

        } else {
            System.out.println(cashToWithdraw + " is provided");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);

            System.out.println("Card ejected");
            atmMachine.setAtmState(atmMachine.getHasNoCardState());

            if (atmMachine.cashInMachine <= 0) {
                atmMachine.setAtmState(atmMachine.getHasNoCashState());
            }
        }
    }
}
