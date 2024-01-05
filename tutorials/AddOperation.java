package practices.tutorials;

public class AddOperation implements MathOperation{
    @Override
    public double performOperation(double operand1, double operand2){
        return operand1 + operand2;
    }
}
