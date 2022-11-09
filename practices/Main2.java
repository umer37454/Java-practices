package practices.practices;

import java.util.Scanner;

class Year2 {
    int days;
    String name;

    public Year2(int days, String name) {
        this.days = days;
        this.name = name;
    }

    public int countdays2(int day) {
        int i;
        i = day / 2;
        return i;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Year2 January = new Year2(31, "January");
        Year2 February = new Year2(28, "February");
        Year2 March = new Year2(31, "March");
        Year2 April = new Year2(30, "April");
        Year2 May = new Year2(31, "May");
        Year2 June = new Year2(30, "June");
        Year2 July = new Year2(31, "July");
        Year2 August = new Year2(31, "August");
        Year2 September = new Year2(30, "September");
        Year2 October = new Year2(31, "October");
        Year2 November = new Year2(30, "November");
        Year2 December = new Year2(31, "December");

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter month in which you want to go out: ");
            String str = input.next();
            {
                if (str.equalsIgnoreCase(January.name) || str.equalsIgnoreCase(February.name) ||
                        str.equalsIgnoreCase(March.name) || str.equalsIgnoreCase(April.name) ||
                        str.equalsIgnoreCase(May.name) || str.equalsIgnoreCase(June.name) ||
                        str.equalsIgnoreCase(July.name) || str.equalsIgnoreCase(August.name) ||
                        str.equalsIgnoreCase(September.name) || str.equalsIgnoreCase(October.name) ||
                        str.equalsIgnoreCase(November.name) || str.equalsIgnoreCase(December.name)) {

                    if (str.equalsIgnoreCase(January.name)) {
                        System.out.println("You can go out for " + January.countdays2(January.days) + " days in " + str);
                    }
                    if (str.equalsIgnoreCase(February.name)) {
                        System.out.println("You can go out for " + February.countdays2(February.days) + " days in " + str);
                    }
                    if (str.equalsIgnoreCase(March.name)) {
                        System.out.println("You can go out for " + March.countdays2(March.days) + " days in " + str);
                    }
                    if (str.equalsIgnoreCase(April.name)) {
                        System.out.println("You can go out for " + April.countdays2(April.days) + " days in " + str);
                    }
                    if (str.equalsIgnoreCase(May.name)) {
                        System.out.println("You can go out for " + May.countdays2(May.days) + " days in " + str);
                    }
                    if (str.equalsIgnoreCase(June.name)) {
                        System.out.println("You can go out for " + June.countdays2(June.days) + " days in " + str);
                    }
                    if (str.equalsIgnoreCase(July.name)) {
                        System.out.println("You can go out for " + July.countdays2(July.days) + " days in " + str);
                    }
                    if (str.equalsIgnoreCase(August.name)) {
                        System.out.println("You can go out for " + August.countdays2(August.days) + " days in " + str);
                    }
                    if (str.equalsIgnoreCase(September.name)) {
                        System.out.println("You can go out for " + September.countdays2(September.days) + " days in " + str);
                    }
                    if (str.equalsIgnoreCase(October.name)) {
                        System.out.println("You can go out for " + October.countdays2(October.days) + " days in " + str);
                    }
                    if (str.equalsIgnoreCase(November.name)) {
                        System.out.println("You can go out for " + November.countdays2(November.days) + " days in " + str);
                    }
                    if (str.equalsIgnoreCase(December.name)) {
                        System.out.println("You can go out for " + December.countdays2(December.days) + " days in " + str);
                    }
                }else if (str.equals("X") || str.equals("x")) {
                    break;
                } else {
                    System.out.println("Invalid month");
                }
            }
        }
    }
}