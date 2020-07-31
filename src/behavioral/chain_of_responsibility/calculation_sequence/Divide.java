package behavioral.chain_of_responsibility.calculation_sequence;

public class Divide implements Chain{
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(CalculationRequest request) {

        if (request.getCalculationWanted().equals("divide")) {
            System.out.println(request.getNumber1() +
                    " / " + request.getNumber2() +
                    " = " + (request.getNumber1() / request.getNumber2()));
        } else {
            System.out.println("Only works for add, subtract, multiply, divide.");;
        }

    }
}
