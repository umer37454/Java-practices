package practices.LinearSearch;

public class minimumNum {
    public static void main(String[] args) {
        int[] arr = {24, 65, 4, 47, 36, 69, 58, 96, 42, 35, 45};
        int ans = minimum(arr);

        if (ans == -1){
            System.out.println("There is no element in array");
        } else {
            System.out.println("Minimum number in an array is: " +
                    "" + minimum(arr));
        }
    }

    static int minimum(int[] arr){
        if (arr.length == 0){
            return -1;
        }

        //first number is assigned as minimum
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minimum > arr[i]){
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
