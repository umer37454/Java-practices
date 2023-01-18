package practices.charactersString;

import java.util.Scanner;

public class firstMiddleLastNames {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String firstName = in.next();
        String middleName = in.next();
        String lastName = in.next();

        System.out.println(firstName.charAt(0) + "." +
                middleName.charAt(0) + "." +
                lastName);

    }
}
