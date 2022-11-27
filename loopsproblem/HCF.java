package practices.loopsproblem;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two number 1: ");
        int a = in.nextInt();

        System.out.print("Enter two number 2: ");
        int b = in.nextInt();

        int gcd = 0;

        for (int i = 1; i <= a; i++){
            if (a % i == 0 && b % i ==0){
                gcd = i;
            }
        }

        System.out.println("Gcd of two numbers is");
        System.out.println(gcd);
    }
}
