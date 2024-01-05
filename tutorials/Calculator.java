package practices.tutorials;

public class Calculator {
    private final MathOperation mathOperation;

    public Calculator(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }

    public double calculate(double operand1, double operand2){
        return mathOperation.performOperation(operand1, operand2);
    }
}
