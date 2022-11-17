package practices.DataTypes;

import java.util.Scanner;

public class sqaureofnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to: ");
        int a = in.nextInt();

        System.out.println("Sqaure of entered number is : " + (a * a));
    }
}
