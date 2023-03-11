package practices.Assignments;

import java.util.Arrays;

public class insertIntoArray {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 0};

        int value = 7;
        int index = 0;

        shift(test, value, index);

        System.out.println(Arrays.toString(test));
    }

    //function to shift
    static void shift(int[] target, int value, int index){

        //looping till on which index have to insert
        //and shifting or reassigning number
        for(int i = target.length-1; i > index; i--){
            target[i] = target[i-1];
        }

        target[index] = value;
    }
}
