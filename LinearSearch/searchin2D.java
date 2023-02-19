package practices.LinearSearch;

import java.util.Arrays;

public class searchin2D {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {14, 15, 23},
                {24, 57, -45, 36, -25},
                {36, 47, 75, 2},
                {3, 6}
        };

        int target = 75;
        System.out.println(Arrays.toString(search(arr, target)));

        System.out.println("Maximum " + maximum(arr));
        System.out.println("Minimum " + minimum(arr));
    }

    static int[] search(int[][] arr, int target){

        //returning index
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target){
                    return new int[]{row,column};
                }
            }
        }

        return new int[]{-1, -1};
    }

    static int maximum(int[][] arr){
        int max = arr[0][0];
        //returning max value with enhanced value
        for (int[] row : arr) {
            for (int column : row) {
                if (max < column) {
                    max = column;
                    return max;
                }
            }
        }

        return -1;
    }

    static int minimum(int[][] arr){
        int min = arr[0][0];
        //returning min value with enhanced value
        for (int[] row : arr) {
            for (int column : row) {
                if (min > column) {
                    min = column;
                    return min;
                }
            }
        }

        return -1;
    }
}