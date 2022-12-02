package practices.loopsproblem;

import java.util.Scanner;

public class primeFactor3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int x = in.nextInt();

        System.out.println("The prime factor of number are");

        for (int i = 2; x > 1; i++) {
            while (x % i == 0) {
                if (x % i == 0) {
                    System.out.println(i);
                    x = x / i;
                }
            }
        }
    }
}
