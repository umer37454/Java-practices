package practices.practices;

import java.util.Scanner;

public class Oddeven {

    static void isoddeven(int n){
        if ((n & 1) == 1){
            System.out.println("The number is odd");
        } else
            System.out.println("The number is even");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = in.nextInt();

        isoddeven(a);

    }
}
