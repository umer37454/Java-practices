package practices.practices;

import java.util.Scanner;

public class CircleArea {

    static double funcarea(double radius){

        // main problem statement soln
        double area = 3.1416 * (radius*radius);
        return area ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking input
        System.out.print("Enter radius circle: ");
        double radius = input.nextDouble();

        double area = funcarea(radius);
        System.out.println(area);

    }
}
