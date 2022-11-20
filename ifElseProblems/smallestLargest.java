package practices.ifElseProblems;

import java.util.Scanner;

public class smallestLargest {

    static void smallest(int a, int b, int c){
        if (a < b){
            if (a < c){
                System.out.println("a is youngest");
            }
        } else if (b < c ){
            System.out.println("b is youngest");
        } else {
            System.out.println("c is youngest");
        }
    }

    static void largest(int a, int b, int c){
        if (a > b){
            if (a > c){
                System.out.println("a is oldest");
            }
        } else if (b > c ){
            System.out.println("b is oldest");
        } else {
            System.out.println("c is oldest");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Age");
        int a = in.nextInt();

        System.out.println("Enter b Age");
        int b = in.nextInt();

        System.out.println("Enter c Age");
        int c = in.nextInt();

        largest(a, b, c);
        smallest(a, b, c);
    }
}
