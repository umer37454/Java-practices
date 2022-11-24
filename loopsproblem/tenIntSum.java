package practices.loopsproblem;

import java.util.Scanner;

public class tenIntSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10; i++){
            int a = in.nextInt();
            sum = sum + a;
        }

        System.out.println(sum);
    }
}
