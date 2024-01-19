package practices.tutorials.Lambdas;
import java.util.function.Predicate;

public class Lambdas {
    public static void main(String[] args) {
        printable(() -> "Hello Lambdas");

        // Example of java.util.function.Predicate
        Predicate<String> isNullOrEmpty = s -> (s == null) || s.isEmpty();
        System.out.println(isNullOrEmpty.test(""));

        // example of checking a number bigger than 50. custom implementation
        numberCheck((number) -> {
            boolean isNumber;

            if (number > 50){
                isNumber = true;
            } else {
                isNumber = false;
            }

            return isNumber;
        });

    }

    public static void printable(Print print){
        System.out.println(print.print());
    }

    public static void numberCheck(NumberCheck numberCheck){
        System.out.println("Is Number bigger than 50 :" + numberCheck.check(6));
        System.out.println("Is Number bigger than 50 :" + numberCheck.check(64));
        System.out.println("Is Number bigger than 50 :" + numberCheck.check(12));
    }
}