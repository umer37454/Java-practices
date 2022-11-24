package practices.loopsproblem;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int a = in.nextInt();

        System.out.println("Table for the number is");
        for (int i = 1; i <= 10; i++){
            int multiply = a * i;
            System.out.println(a + "*" + i + "=" + multiply);
        }
    }
}
