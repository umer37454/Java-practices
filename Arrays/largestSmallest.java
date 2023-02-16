package practices.Arrays;

import java.util.Scanner;

public class largestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array ");
        int arrayLength = input.nextInt();

        System.out.println("Enter elements");
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = input.nextInt();
        }

        int max = -454145;
        int min = 4578454;

        for (int i = 0; i < arrayLength; i++){
            if (array[i] > max){
                max = array[i];
            }

            if (array[i] < min){
                min = array[i];
            }
        }

        System.out.println("Max " + max);
        System.out.println("Min " + min);
    }
}
