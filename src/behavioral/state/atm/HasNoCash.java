package behavioral.state.atm;

public class HasNoCash implements ATMState{

    //A context we are going to work with
    ATMMachine atmMachine;

    public HasNoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("We do not have cash. Card processing not supported");
    }

    @Override
    public void ejectCard() {
        System.out.println("We do not have cash. Card processing not supported");
    }

    @Override
    public void enterPin(int pinEntered) {
        System.out.println("We do not have cash. Card processing not supported");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("We do not have cash");
    }
}
