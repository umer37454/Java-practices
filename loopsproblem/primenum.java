package practices.loopsproblem;

import java.util.Scanner;

public class primenum {

    static void prime(int n){
        int count = 0;

        for (int i = 1; i<=n; i++){
            if (n % i == 0){
                count = count + 1;
            }
        }

        if (count == 2){
            System.out.println("It is prime number");
        } else {
            System.out.println("Not a prime number");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();

        prime(n);
    }
}
