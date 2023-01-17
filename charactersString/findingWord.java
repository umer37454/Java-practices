package practices.charactersString;

import java.util.Scanner;

public class findingWord {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = "how are you";
        System.out.println(str);

        System.out.println("Type a word to check if its there in above string");
        String toFind = in.next();

        if (str.contains(toFind)){
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

    }
}
