package practices.charactersString;

import java.util.Scanner;

public class LastappFirstapp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = in.nextLine();

        System.out.println("Length of string");
        System.out.println(str.length());

       /* boolean first = false;
        boolean last = false;*/

        while (true) {
            System.out.println("Enter a character to find position");
            char toFind = in.next().charAt(0);

            if (str.indexOf(toFind) != -1) {

            /*for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == toFind) {
                    first = true;
                    break;
                }
            }

            for (int i = str.length() - 1; i > 0; i--) {
                if (str.charAt(i) == toFind) {
                    last = true;
                    break;
                }
            }*/

                /*if (first) {*/
                System.out.println("First appearance of " + toFind + " is at index " + str.indexOf(toFind));
                //}

                //if (last) {
                System.out.println("Last appearance of " + toFind + " is at index " + str.lastIndexOf(toFind));
                //}

                break;
            } else {
                System.out.println("Character not present");
            }
        }

    }
}
