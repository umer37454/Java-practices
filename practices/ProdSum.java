package practices.practices;

import java.util.Scanner;

public class ProdSum {

    static int prodsum(int n){
        int sum=0;
        int product=1;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum+=rem;
            product=product*rem;
        }
        return product-sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking user input
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        
        int sol = prodsum(n);
        System.out.println(sol);
    }
}
