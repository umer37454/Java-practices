package practices.charactersString;

import java.util.Scanner;

public class isPalin{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < s.length(); i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);
            if (start != end) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome){
            System.out.println("true");
        } else
            System.out.println("false");
    }
}
