package practices.Assignments;

import java.util.Arrays;

public class smallThanCurrent {
    public static void main(String[] args) {
        int[] nums = {7,5,6,4,9,2,1,3};

        System.out.println(Arrays.toString(smallCurrent(nums)));
    }

    static int[] smallCurrent(int[] nums){
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++){
            int count = 0;
            for (int j = 0; j < ans.length; j++){
                if (nums[j] < nums[i]){
                    count++;
                }
            }
            ans[i] = count;
        }

        return ans;
    }
}
