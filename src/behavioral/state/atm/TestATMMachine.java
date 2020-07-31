package behavioral.state.atm;

public class TestATMMachine {
    public static void main(String[] args) {

        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard();
        atmMachine.ejectCard();

        System.out.println("---------------------");

        atmMachine.insertCard();
        atmMachine.enterPin(1234);
        atmMachine.requestCash(2000);

        System.out.println("---------------------");

        atmMachine.insertCard();
        atmMachine.enterPin(1234);

    }
}
