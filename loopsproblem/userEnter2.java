package practices.loopsproblem;

import java.util.Scanner;

public class userEnter2 {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        int count = 0;

        String choic = "";

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter");
            choic = in.next();
            if (!choic.equals("q")){
                int number = Integer.parseInt(choic);
                sum = sum + number;
                product = product * number;
                count++;
            }
        } while (!choic.equals("q"));

        System.out.println(product);
        System.out.println(sum);
        System.out.println(sum/count);
    }
}
