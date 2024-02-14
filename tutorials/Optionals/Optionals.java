package practices.tutorials.Optionals;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Optionals {
    public static void main(String[] args) {
        Optional<Integer> numExist = Optional.of(8);
        Optional<Integer> numNotExist = Optional.empty();

        System.out.println(numExist.isPresent());
        System.out.println(numNotExist.isPresent());

        numExist.ifPresent(System.out::println);

        Optional<Integer> result = findElement(new Integer[]{45, 55, 12}, 5);
        System.out.println(result);
    }

    public static Optional<Integer> findElement(Integer[] arr, int element){
//        for (int i = 0; i < arr.length; i++){
//            if(arr[i] == element){
//                return element;
//            }
//        }
//        return null;

        // using stream api
        return Arrays.stream(arr).filter((integer) -> integer == element).findFirst();
    }
}
