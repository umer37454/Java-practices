package practices.practices;

import java.util.Scanner;

public class CountOddNumbers {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter low number: ");
        int low = input.nextInt();

        System.out.println("Enter high number: ");
        int high = input.nextInt();

        int a = countOdds(low,high);
        System.out.println(a);
    }

     static int countOdds(int low, int high) {
        int diff = high - low;
        if(low % 2 == 0 && high % 2 == 0)
        {
            return diff / 2;
        }
        else
        {
            return (diff / 2) + 1;
        }
    }
}