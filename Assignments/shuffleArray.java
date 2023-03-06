package practices.Assignments;

import java.util.Arrays;

public class shuffleArray {
    public static void main(String[] args) {
        // for shuffling, length should be even
        // dividing array by into parts then start assigning it in the new array
        int[] arr = {2,4,3,     8,6,3,    2,6,7};
        int n = arr.length / 3;

        System.out.println(Arrays.toString(shuffle(arr, n)));
    }

    static int[] shuffle(int[] arr, int n){
        int[] ans = new int[3 * n];

        int j = 0;

        for (int i = 0; i < 3 * n; i = i + 3){
            ans[i] = arr[j];
            ans[i + 1] = arr[j + n];
            ans[i + 2] = arr[j + n + n];
            j++;
        }

        return ans;
    }
}