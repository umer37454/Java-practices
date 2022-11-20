/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.
*/

package practices.ifElseProblems;

import java.util.Scanner;

public class salaryBonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Salary");
        int a = in.nextInt();

        System.out.println("Enter years of service");
        int b = in.nextInt();

        //for discount
        // discount percent divide by 100 and multiply by amount
        if (b > 5){
            System.out.println("Your bonus amount will be");
            System.out.println(0.05 * a);
        } else {
            System.out.println("Ineligible for bonus amount");
        }
    }
}
