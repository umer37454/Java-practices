package practices.loopsproblem;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = in.nextInt();

        System.out.print("Enter number 2: ");
        int b = in.nextInt();

        int Arm;

        int t,r;
        for ( ; a <= b; a++){
            Arm = 0;
            t = a;
            while (t != 0) {
                r = t % 10;
                Arm = Arm + (r * r * r);
                t = t/10;
            }
            if (Arm == a)
                System.out.println(a);
        }
    }
}
