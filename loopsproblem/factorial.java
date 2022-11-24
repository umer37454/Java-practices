package practices.loopsproblem;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();

        int f = 1;

        //while loop method
        /*while (n >= 1){
            f = f * n;
            n--;
        }*/

        //for loop method
        for (int i = 1; i <= n; i++){
            f = f*i;
        }

        //2nd for loop method
        for (int i = n; i >= 1; i--){
            f = f*i;
        }

        System.out.println(f);
    }
}
