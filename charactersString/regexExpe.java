package practices.charactersString;

import java.util.Scanner;

public class regexExpe {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = in.nextLine();

        while (true) {
            System.out.println("Enter a word to find from above string");
            String toFind = in.next();

            String[] newStr = str.split(" ");

            boolean isThere = false;

            for (String s : newStr) {
                if (s.equals(toFind)) {
                    isThere = true;
                    break;
                }
            }

            if (isThere) {
                System.out.println(toFind + " is Present in " + str);
                break;
            } else {
                System.out.println("Invalid word");
            }
        }

    }
}
