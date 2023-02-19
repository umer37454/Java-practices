package practices.LinearSearch;

public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {24, -87, 65, 4, 47, 36, -69, 58, 96, 42, -35, 45};
        int target = 96;

        // can specify variable for start and end but it takes a memory
        //int start = 3;
        //int end = 8;

        //int ans = inRange(arr, target, start, end);

        //directly assigning start and end
        int ans = inRange(arr, target, 3, 8);

        System.out.println(target + " available at index " + ans);
    }

    static int inRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        //for loop to check target is there or not in array in a range
        for (int index = start; index <= end; index++) {
            int elements = arr[index];
            if (elements == target) {
                return index;
            }
        }

        //if none above return executed then return this
        return -1;
    }
}