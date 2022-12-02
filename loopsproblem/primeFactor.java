package practices.loopsproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class primeFactor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int x = in.nextInt();

        List<Integer> primeNumbers = new ArrayList<>();

        System.out.println("The factor of number are");
        for (int i = 2; i <= x; i++ ){
            boolean isPrime = true;
            if (x % i == 0){
                System.out.print(i + " ");
                for (int j = 2; j <= i/2; j++){
                    if (i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    primeNumbers.add(i);
                }
            }
        }

        System.out.println();
        System.out.println("The prime factor of number are");
        for (int k : primeNumbers){
            System.out.print(k + " ");
        }
    }
}
