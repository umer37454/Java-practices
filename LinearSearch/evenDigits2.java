//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//to find how many element of array made up of odd or even digits
package practices.LinearSearch;

public class evenDigits2 {
    public static void main(String[] args) {
        int[] arr= {14, 78, 256, 2, 7, 36};
        System.out.println(findNumbers(arr));
        System.out.println(countDigits(0));
    }

    static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        //int digit = countDigits(num); another way but will take memory
        /*
        if (countDigits(num) % 2 == 0){
            return true;
        }
        return false;
        */
        //return digit % 2 == 0;
        return countDigits(num) % 2 == 0;
    }

    static int countDigits(int num){
        int count = 0;

        if (num == 0){
            return 1;
        }
        while (!(num == 0)){
            count++;
            num = num / 10;
        }

        return count;
    }
}
