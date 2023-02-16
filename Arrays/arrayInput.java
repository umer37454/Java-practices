package practices.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        arrayInputfunc();
    }

    static void arrayInputfunc(){
        Scanner input = new Scanner(System.in);

        //taking length from user
        int arrayLength = input.nextInt();

        //defining array
        int[] array = new int[arrayLength];

        //loop will run till less than arraylength
        for (int i = 0; i < arrayLength; i++) {
            array[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(array));

    }
}
