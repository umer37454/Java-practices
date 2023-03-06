package practices.BInarySearch;

public class floorNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,9,12,17,22,36};
        int target = 7;
        System.out.println(floor(arr,target));
    }

    //return the greatest no <= target
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int middle = start + (end - start) / 2;

            if (arr[middle] == target){
                return arr[middle];
            }

            if (target < arr[middle]){
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return arr[end];
    }
}
