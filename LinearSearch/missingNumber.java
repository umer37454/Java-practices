package practices.LinearSearch;
//comeback to this after sometime
public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9,10};
        System.out.println(missing(arr));

    }

    static int missing(int[] arr){
        for (int a : arr) {
            for (int i = 1; i <= 10; i++) {
                if (a == i){
                    System.out.println(a);
                }
            }
        }
        return 0;
    }
}
