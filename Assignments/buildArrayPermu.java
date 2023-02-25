package practices.Assignments;

import java.util.Arrays;

public class buildArrayPermu {
    public static void main(String[] args) {
        //this array contains only numbers within its length
        //also avoid repeating
        int[] nums = {0,2,1,5,3,4};

        int[] newArray = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            newArray[i] = nums[nums[i]];
        }

        System.out.println(Arrays.toString(newArray));
    }
}
