package practices.tutorials;

class Car {
    private int number;
    private String name;

    public Car(int number, String name){
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString(){
        return name;
    }
}

public class practice {

    public static void main(String[] args) {
        int a = 4;
        System.out.println(a);

        Car alto = new Car(452, "Alto 420");
        System.out.println(alto.toString());

        MathOperation add = new AddOperation();
        Calculator addition = new Calculator(add);
        System.out.println(addition.calculate(5, 8));

        MathOperation sub = new SubtractionOperation();
    }
}
