package practices.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {24, -87, 65, 4, 47, 36, -69};

        int target = 65;
        int element = 64;

        int ans = linearSearch(arr, target); // return index of an element
        int ans2 = linearSearch2(arr, element); // return element

        System.out.println(ans);
        System.out.println(ans2);
    }

    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //for loop to check target is there or not in array
        //not making use of index so using for each loop
        for (int elements : arr) {
            if (elements == target) {
                return elements;
            }
        }

        //if none above return executed then return this
        return -1;
    }

    //function to return index of array
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //for loop to check target is there or not in array
            for (int index = 0; index < arr.length; index++) {
            int elements = arr[index];
            if (elements == target) {
                return index;
            }
        }

        //if none above return executed then return this
        return -1;
    }
}

