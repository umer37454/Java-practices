package practices.BInarySearch;

public class agnosticBinary {
    public static void main(String[] args) {
        int[] arr = {85, 75, 62, 12, 3, 0, -24, -34, -48};
        int target = 3;
        System.out.println(orderAgnostic(arr, target));
    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int middle = start + (end - start) / 2;

            if (arr[middle] == target){
                return middle;
            }

            if (isAsc){
                if (target < arr[middle]){
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (target > arr[middle]){
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
