package practices.practices;

import java.util.Scanner;

public class AvgSalaryExcMinMum {

    static double average(int[] salary) {
        int max = -1;
        int min = 2147483647;
        double sum = 0;

        for (int i : salary) {
            sum += i;

            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);

        sum = sum - max - min;

        double average;
        average = sum / (salary.length - 2);
        return average;

    }
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            System.out.println("Enter size of array: ");
            int a = input.nextInt();

            int[] salar = new int[a];

            System.out.println("Enter Salaries");
            int i;
            for (i = 0; i < a; i++) {
                salar[i] = input.nextInt();
            }

            double b = average(salar);

            System.out.println("Average excluding max and min salary is: " + b);
        }
}


