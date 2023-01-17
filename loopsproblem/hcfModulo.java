package practices.loopsproblem;

import java.util.Scanner;

public class hcfModulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two number 1: ");
        int a = in.nextInt();

        System.out.print("Enter two number 2: ");
        int b = in.nextInt();

        while (a % b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        System.out.println("GCD " + b);
    }
}
