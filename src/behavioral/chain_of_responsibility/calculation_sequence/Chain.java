package behavioral.chain_of_responsibility.calculation_sequence;

public interface Chain {

    public void setNextChain(Chain nextChain);

    public void calculate(CalculationRequest request);
}
