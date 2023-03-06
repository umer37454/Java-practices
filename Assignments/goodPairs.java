package practices.Assignments;

public class goodPairs {
    public static void main(String[] args) {
        int[] nums = {1,5,2,1,1,3,4,5};

        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    pairs++;
                }
            }
        }

        return pairs;
    }
}
