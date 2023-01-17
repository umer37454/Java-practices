package practices.charactersString;

import java.util.Scanner;

public class findingAlphabetInStr {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any word: ");
        String word = in.next();

        boolean find = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e'){
                find = true;
                break;
            }
        }

        if (find){
            System.out.println("E is there");
        } else {
            System.out.println("Not present");
        }
    }

}
