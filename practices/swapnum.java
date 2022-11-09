package practices.practices;

import java.util.Scanner;

public class swapnum {

    static void num(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println(a +" " + b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        num(a,b);

    }
}