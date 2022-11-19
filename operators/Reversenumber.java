package practices.operators;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = in.nextInt();

        int reverse = 0;

        while (a!=0){
            int digit = a % 10;
            reverse = reverse * 10 + digit;
            a = a / 10;
        }

        System.out.println(reverse);

    }
}
