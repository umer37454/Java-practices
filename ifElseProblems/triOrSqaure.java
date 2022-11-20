package practices.ifElseProblems;

import java.util.Scanner;

public class triOrSqaure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("side 1");
        int l = in.nextInt();

        System.out.println("side 2");
        int b = in.nextInt();

        if (l == b) {
            System.out.println("It is square");
            System.out.println("Area of square: " + (l*b));
        } else {
            System.out.println("It is rectangle");
            System.out.println("Area of rectangle: " + 2 * (l + b));
        }
    }
}
