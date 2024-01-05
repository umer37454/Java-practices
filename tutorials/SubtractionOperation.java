package practices.tutorials;

public class SubtractionOperation implements MathOperation{
    @Override
    public double performOperation(double operand1, double operand2) {
        return operand2 - operand1;
    }
}
