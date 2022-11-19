package practices.operators;

import java.util.Scanner;

public class digitAddition {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a 4 digit number: ");
        int a = in.nextInt();
        System.out.println("Your 4 digit number is: " + a);

        int first, second, third, fourth;

        fourth = a % 10;
        a = a / 10;

        third = a % 10;
        a = a / 10;

        second = a % 10;
        a = a / 10;

        first = a;

        System.out.println("Addition of 1st and 3rd digit: " + (first + third));

    }
}
