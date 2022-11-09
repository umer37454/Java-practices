package practices.practices;

import java.util.Scanner;

public class Finduniq {

    static int unique(int[] arr){
        int uni = 0;
        for (int i : arr){
            uni = uni^i;
        }
        return uni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int a = in.nextInt();

        int[] arr = new int[a];

        System.out.print("Now enter values in arrays: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Your array is: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        int b = unique(arr);
        System.out.println("Your unique number in array is: " + b);

    }
}
