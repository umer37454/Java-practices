package practices.Primenumbers;

//a prime number that has two facto - 1 & itself

import java.util.ArrayList;
import java.util.List;

public class primenum3 {
    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int numtocheck = 2; numtocheck <= 100; numtocheck++ ){

            boolean isPrime = true;

            for (int factor = 2; factor <= numtocheck/2; factor++){
                if (numtocheck % factor == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                primeNumbers.add(numtocheck);
            }
        }

        System.out.println("Prime numbers 1 to 100 are: ");
        for (int numbers : primeNumbers){
            System.out.println(numbers);
        }
    }
}
