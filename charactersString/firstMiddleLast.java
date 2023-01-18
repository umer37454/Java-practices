package practices.charactersString;

import java.util.Scanner;

public class firstMiddleLast {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name = in.nextLine();

        //taking out last name by finding last space
        int lastNameNum = name.lastIndexOf(' ');

        //printing first charac of name
        System.out.print(name.charAt(0) + ".");

        //running array till less than last space
        //and then on instance of space fetching first charac of
        //remaining name by adding +1 to space
        for (int i = 0; i < lastNameNum; i++){
            char space = name.charAt(i);
            if (space == ' '){
                System.out.print(name.charAt(i + 1) + ".");
            }
        }

        System.out.print(name.substring(lastNameNum + 1));

    }
}
