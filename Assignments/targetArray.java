package practices.Assignments;

import java.util.Arrays;

public class targetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));

    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];

        for(int i=0; i<index.length; i++){
            shift(target, nums[i], index[i]);
        }

        return target;
    }

    //shift function
    public static void shift(int[] target, int value, int index){
        for(int i=target.length-1; i>index; i--){
            target[i] = target[i-1];
        }

        target[index] = value;
    }
}
