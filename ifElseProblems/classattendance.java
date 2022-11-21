package practices.ifElseProblems;

import java.util.Scanner;

public class classattendance {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float percent;

        System.out.println("Enter class held");
        float a = in.nextInt();

        System.out.println("Enter class attended");
        float b = in.nextInt();

        if (a > b) {
            System.out.println("Your percentage");
            percent = b / a * 100;
            System.out.println(percent);
            if (percent < 75) {
                System.out.println("Enter Medical Y/N");
                char medical = in.next().charAt(0);
                if (medical == 'Y' || medical == 'y') {
                    System.out.println("Allowed to sit");
                } else {
                    System.out.println("Not allowed to sit in exam");
                }
            } else {
                System.out.println("You are allowed to sit in exam");
            }
        } else {
            System.out.println("Invalid class");
        }

    }
}

