package practices.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int arrayLength = input.nextInt();

        int[] array = new int[arrayLength];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = input.nextInt();
        }

        int[] reverseArray = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++){
            //matching position from reverse of 1st array to
            //position of 2nd array
            reverseArray[i] = array[arrayLength - 1 - i];
        }

        System.out.println("Reverse array is: ");
        System.out.println(Arrays.toString(reverseArray));
    }
}
