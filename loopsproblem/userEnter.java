package practices.loopsproblem;

import java.util.Scanner;

public class userEnter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int product = 1;
        int sum = 0;
        int count = 0;
        String choice = "";

        while (!choice.equals("q")) {
            System.out.println("Enter");
            choice = in.next();

            if (!choice.equals("q")) {
                int number = Integer.parseInt(choice);
                sum = sum + number;
                product = product * number;
                count++;
            }

        }

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        try {
            System.out.println("Average : " + sum / count);
        } catch (ArithmeticException e) {
            System.out.println("Cant divide by zero");
        }

    }
}
