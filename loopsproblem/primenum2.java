package practices.loopsproblem;

import java.util.Scanner;

public class primenum2 {

    static void prime(int n) {

        System.out.println("Your prime numbers between 1 & " + n + " are: ");
        for (int i = 1; i <= n; i++) {

            int count = 0;

            for (int j = 1; j <= i; j++) {

                if (n % i == 0) {
                    count = count + 1;
                }

                if (count == 2) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();

        prime(n);
    }
}
