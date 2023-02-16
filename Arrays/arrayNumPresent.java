package practices.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayNumPresent {
    public static void main(String[] args) {
        arraysInput();
    }

    static void arraysInput(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of array: ");
        int lengthArray = input.nextInt();

        int[] arry = new int[lengthArray];

        // > - greater than < - less than
        for(int i = 0; i < lengthArray; i++){
            System.out.println("Enter indexes of an array: " + i);
            arry[i] = input.nextInt();
        }

        System.out.println("Here is your array");
        System.out.println(Arrays.toString(arry));

        System.out.println("Enter num to find");
        int numfind = input.nextInt();

        boolean find = false;

        //break to terminate loop when condition is met
        for (int j: arry) {
            if (numfind == j) {
                find = true;
                break;
            }
        }

        if (find){
            System.out.println("present");
        } else {
            System.out.println("not present");
        }
    }
}
