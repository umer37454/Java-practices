package practices.charactersString;

import java.util.Scanner;

class Delete{

    public Delete(String str) {

        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if (!(ch == 'u' || ch == 'v' || ch == 'i' || ch == 'o' || ch == 'a')){
                newString.append(ch);
            }
        }

        System.out.println(newString);
    }

}

public class deletingVowels {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String string = input.nextLine();

        Delete str = new Delete(string);
    }
}