package practices.BInarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-45, -32, -24, 0, 1, 3, 6, 12, 14, 32, 42, 52,
                67, 78, 98};
        int target = 42;
        System.out.println(binarySearh(arr, target));
    }

    //return index & return -1 if it doesnt exist
    static int binarySearh(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //find middle element
        while (start <= end){
            int middle = start + (end - start) / 2;

            if (arr[middle] == target){
                return middle;
            }

            //checking position of middle element
            if (target < arr[middle]){
                end = middle - 1;
            } else /*if (target > arr[middle])*/{
                start = middle + 1;
            } /*else {
                return middle;
            }*/
        }
        return -1;
    }
}
