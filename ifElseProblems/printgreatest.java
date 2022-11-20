package practices.ifElseProblems;

import java.util.Scanner;

public class printgreatest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("a");
        int a = in.nextInt();

        System.out.println("b");
        int b = in.nextInt();

        if (a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
