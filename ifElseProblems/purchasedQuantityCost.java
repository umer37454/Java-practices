/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.*/


package practices.ifElseProblems;

import java.util.Scanner;

public class purchasedQuantityCost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Quantity");
        int a = in.nextInt();

        if((a * 100) > 1000){
            System.out.println("Your discount " + (0.1 * a * 100));
            System.out.println("Your total cost is " + ((a*100)-0.1 * a * 100));
        }else {
            System.out.println("No discount");
            System.out.println("Your cost is " + (a * 100));
        }
    }
}
