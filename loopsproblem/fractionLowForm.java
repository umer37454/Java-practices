package practices.loopsproblem;

import java.util.Scanner;

public class fractionLowForm {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter two number 1: ");
        int a = in.nextInt();

        System.out.print("Enter two number 2: ");
        int b = in.nextInt();

        int num = a;
        int den = b;

        while (a % b != 0){
            int r = a % b;
            a = b;
            b = r;
        }

        System.out.println("GCD " + b);
        System.out.println("Lowest form " + num/b + "/" + den/b);

    }
}

