package practices.operators;

import java.util.Scanner;

public class countNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = in.nextInt();

        int count = 0;

        //just counting loop count
        while (a!=0){
            int digit = a % 10;
            count = count + 1;
            a = a / 10;
        }

        System.out.println(count);

    }
}
