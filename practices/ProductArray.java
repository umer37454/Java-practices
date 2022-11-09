package practices.practices;

import java.util.Scanner;

class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;

        for (int i : nums) {
            if (i == 0)
                return 0;
            else if (i < 0)
                sign = -sign;
        }
        return sign;
    }
}

public class ProductArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int a = input.nextInt();

        int[] salar = new int[a];

        System.out.println("Enter Numbers");
        int i;
        for (i = 0; i < a; i++) {
            salar[i] = input.nextInt();
        }

        Solution obj = new Solution();
        int b = obj.arraySign(salar);

        if (b == 0)
            System.out.println("Array is zero: " + b);
        else if (b > 0)
            System.out.println("Array is positive: " + b);
        else
            System.out.println("Array is negative: " + b);
    }
}
