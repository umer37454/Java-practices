package practices.Assignments;

import java.util.Arrays;

public class runningsum1d {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,3,7,8,42,1};

        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] runningSum(int[] nums) {
        int[] runsum = new int[nums.length];

        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            runsum[i] = sum;
        }

        return runsum;
    }
}