package practices.Assignments;

import java.util.Arrays;

public class concatArray {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,3,7,8,42,1};

        int[] ans = concat(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] concat(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }
}
