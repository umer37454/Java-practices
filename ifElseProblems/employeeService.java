package practices.ifElseProblems;

import java.util.Scanner;

public class employeeService {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = in.nextInt();

        if (age <= 60) {
            System.out.println("Enter gender");
            char gender = in.next().charAt(0);
            if (gender == 'F' && age >= 20) {
                System.out.println("Work in Urban area");
            } else if (gender == 'M' && age >= 20 && age <= 40) {
                System.out.println("Work anywhere");
            } else if (gender == 'M' && age >= 40) {
                System.out.println("Work in urban area");
            } else {
                System.out.println("Ineligible");
            }
        } else System.out.println("Ineligible");
    }
}
