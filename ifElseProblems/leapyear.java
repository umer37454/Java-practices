package practices.ifElseProblems;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Year");
        int a = in.nextInt();

        if (a % 100 == 0){
            if (a % 400 == 0){
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }
        } else if (a % 4 == 0){
                System.out.println("Leap year");
        } else {
                System.out.println("Not a leap year");
        }
    }
}
