package practices.Arrays;

import java.util.Scanner;

public class posiNegOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking length from user
        int arrayLength = input.nextInt();

        //defining array
        int[] array = new int[arrayLength];

        //loop will run till less than arraylength
        for (int i = 0; i < arrayLength; i++) {
            array[i] = input.nextInt();
        }

        int positive = 0;
        int negative = 0;
        int odd = 0;
        int even = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] > 0) {
                positive++;
                if (array[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            } else if (array[i] < 0) {
                negative++;
                if (array[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }

        System.out.println("Positive " + positive);
        System.out.println("Negative " + negative);
        System.out.println("Even " + even);
        System.out.println("Odd " + odd);

    }
}
