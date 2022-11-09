package practices.practices;

import java.util.Scanner;

public class Largestofnumbyuser {

    static int largest(){
        Scanner console = new Scanner(System.in);

        int number;
        int max = -1;

        System.out.println("Enter the number: ");
        do {
            number = console.nextInt();

            if (number > max) { // suppose u put 15 then max become 15
                max = number;  // but in 2nd iteration if u put 14 then 14>15 nd max will remain 15
            }                 // and will remain 15 until u put bigger than 16

        } while (number != 0);

        return max;
    }

    public static void main(String[] args) {

        for (int i = 1 ; i<=4; i++) {
            int x = largest();
            System.out.println("Largest number: " + x);
        }
    }

}

