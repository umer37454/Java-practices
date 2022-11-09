package practices.practices;

import java.util.Scanner;

public class Decimaltobinary {

    static void dectobin(int n){
        int[] binary= new int[40];
        int i = 0;
        while(n > 0){
            binary[i] = n%2;
            n = n/2;
            i++;
        }
        for(int j = i-1; j >= 0; j--){
            System.out.print(binary[j]);
        }
       // System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = input.nextInt();
        dectobin(a);
    }
}
