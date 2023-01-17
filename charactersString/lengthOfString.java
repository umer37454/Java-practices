package practices.charactersString;

import java.util.Scanner;

public class lengthOfString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any word: ");
        String word = in.next();

        int length = word.length();

        System.out.println("The length of your" + word + " is " + length);
    }
}
