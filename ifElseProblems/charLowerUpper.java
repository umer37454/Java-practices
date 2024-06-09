/*The ASCII value of the lowercase alphabet is from 97 to 122.
And, the ASCII value of the uppercase alphabet is from 65 to 90.*/

package practices.ifElseProblems;

import java.util.Scanner;

public class charLowerUpper {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter character");
        char ch = in.next().charAt(0);
        int a;
        a = ch; //conversion of character into int
        System.out.println(a);

        //  > - greater than
        //  < - less than
        if (a >= 65 && a <= 90) {
            System.out.println("Uppercase Letter");
        } else
            System.out.println("Lowercase Letter");

    }
}
