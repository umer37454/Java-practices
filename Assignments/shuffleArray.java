package practices.Assignments;

import java.util.Arrays;

public class shuffleArray {
    public static void main(String[] args) {
        // for shuffling, length should be even
        int[] arr = {2,4,3,8,6,3};
        int n = arr.length / 2;

        System.out.println(Arrays.toString(shuffle(arr, n)));
    }

    static int[] shuffle(int[] arr, int n){
        int[] ans = new int[2 * n];

        int j = 0;

        for (int i = 0; i < 2 * n; i = i + 2){
            ans[i] = arr[j];
            ans[i + 1] = arr[j + n];
            j++;
        }

        return ans;
    }
}
