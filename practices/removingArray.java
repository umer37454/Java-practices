package practices.practices;

import java.util.Arrays;
import java.util.Scanner;

class array {
    int[] b;
    int removeindex;

    public array(int[] b, int removeindex) {
        this.b = b;
        this.removeindex = removeindex;
    }

    public void functoremove() {
        for (int i = removeindex; i < b.length - 1; i++) {
            b[i] = b[i + 1];
        }
        System.out.println("After removing array element " + Arrays.toString(b));
        System.out.println("Length will remain same " + b.length);
    }
}

public class removingArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int a = input.nextInt();

        int[] b = new int[a];

        System.out.println("Enter Numbers");
        int i;
        for (i = 0; i < a; i++) {
            b[i] = input.nextInt();
        }
        System.out.println("Your array is " + Arrays.toString(b));

        System.out.println("Enter index number to be removed: ");
        int c = input.nextInt();

        array obj = new array(b,c);
        obj.functoremove();
    }
}
