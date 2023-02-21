//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//to find how many element of array made up of odd or even digits
package practices.LinearSearch;

public class evenDigits {
    public static void main(String[] args) {
        int[] arr= {14, 78, 256, 2, 7, 36};
        System.out.println(findNumbers(arr));
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
        String str = num + " ";
        int length = str.length();

        return length % 2 == 0;
    }
}
