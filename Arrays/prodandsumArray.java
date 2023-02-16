package practices.Arrays;

import java.util.Scanner;

public class prodandsumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = input.nextInt();

        int[] Array = new int[size];

        System.out.println("Enter indexes of array: ");
        for (int i = 0; i < size; i++){
            Array[i] = input.nextInt();
        }

        int product = prodArr(Array);
        int sum = sumArr(Array);

        System.out.println("Product of array is: " + product);
        System.out.println("Sum of array is: " + sum);

    }

    static int prodArr(int[] numbers){
        int product = 1;
        for (int i : numbers) {
            product = product * i;
        }
        return 1;
    }

    static int sumArr(int[] numbers){
        int sum = 0;
        for (int i : numbers) {
            sum = sum + i;
        }
        return sum;
    }
}
