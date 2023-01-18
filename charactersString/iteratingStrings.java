package practices.charactersString;

import java.util.Scanner;

public class iteratingStrings {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = in.nextLine();

        //iterating normal from first
        for (int i = 0; i < str.length(); i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //iterating reverse from last
        for (int i = str.length() - 1; i >= 0 ; i--) {
            System.out.print(i + " ");
        }
    }
}
