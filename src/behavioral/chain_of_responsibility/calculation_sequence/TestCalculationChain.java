package behavioral.chain_of_responsibility.calculation_sequence;

public class TestCalculationChain {

    public static void main(String[] args) {
        Chain chainStart = new Add();
        Chain chain2 = new Subtract();
        Chain chain3 = new Multiply();
        Chain chain4 = new Divide();

        chainStart.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);

        CalculationRequest request1 = new CalculationRequest(3, 15, "add");
        chainStart.calculate(request1);

        CalculationRequest request2 = new CalculationRequest(4, 8, "subtract");
        chainStart.calculate(request2);

        CalculationRequest request3 = new CalculationRequest(12, 10, "multiply");
        chainStart.calculate(request3);

        CalculationRequest request4 = new CalculationRequest(16, 7, "divide");
        chainStart.calculate(request4);

        CalculationRequest request5 = new CalculationRequest(2, 4, "pow");
        chainStart.calculate(request5);
    }
}
