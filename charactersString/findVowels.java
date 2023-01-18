package practices.charactersString;

import java.util.Scanner;

public class findVowels {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String name = in.nextLine();

        System.out.println("Vowels");

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a'|| name.charAt(i) == 'i'|| name.charAt(i) == 'o'|| name.charAt(i) == 'v'|| name.charAt(i) == 'u'){
                System.out.print(name.charAt(i) + " ");
            }
        }

    }
}
