package practices.ifElseProblems;

import java.util.Scanner;

public class reverse4Digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 4 digit number");
        int a = in.nextInt();
        int count = 0;
        int n;

        while (a != 0) {
            n = a % 10;
            count = count * 10 + n;
            a = a / 10;
        }

        System.out.println(count);
    }
}
