package practices.LinearSearch;

public class biggestIn2d {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,4},
                {4,7,6},
                {7,5,6}
        };
        System.out.println(richest(arr));
    }

    static int richest(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum = sum + anInt;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
