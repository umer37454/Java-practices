package practices.practices;

import java.util.Scanner;

public class Sumofnumbyusers {

    static int sum(int r) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        int n;
        do {         // first user will enter number then only we can check if n is 0 or not
            n = input.nextInt();
            r = r + n;
        } while (n != 0);

        return r;
    }


    public static void main(String[] args) {

        int r = 0;

        int a = sum(r);
        System.out.println("Your sum is: " + a);
    }
}
