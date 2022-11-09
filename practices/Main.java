package practices.practices;

import java.util.Scanner;

class Year{
    int days;
    String name;

    public Year(int days, String name) {
        this.days = days;
        this.name = name;
    }

    public int countdays(int day){
        int i;
        i = day / 2;
        return i;
    }
}

public class Main{
    public static void main(String[] args) {
        Year January = new Year(31, "January");
        Year February = new Year(28, "February");
        Year March = new Year(31, "March");
        Year April = new Year(30, "April");
        Year May = new Year(31, "May");
        Year June = new Year(30, "June");
        Year July = new Year(31, "July");
        Year August = new Year(31, "August");
        Year September = new Year(30, "September");
        Year October = new Year(31, "October");
        Year November = new Year(30, "November");
        Year December = new Year(31, "December");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter month in which you want to go out: ");
        String str = input.next();

        switch (str) {
            case "January" -> System.out.println("You can go out for " + January.countdays(January.days) + " days in " + str);
            case "February" -> System.out.println("You can go out for " + February.countdays(February.days) + " days in " + str);
            case "March" -> System.out.println("You can go out for " + March.countdays(March.days) + " days in " + str);
            case "April" -> System.out.println("You can go out for " + April.countdays(April.days) + " days in " + str);
            case "May" -> System.out.println("You can go out for " + May.countdays(May.days) + " days in " + str);
            case "June" -> System.out.println("You can go out for " + June.countdays(June.days) + " days in " + str);
            case "July" -> System.out.println("You can go out for " + July.countdays(July.days) + " days in " + str);
            case "August" -> System.out.println("You can go out for " + August.countdays(August.days) + " days in " + str);
            case "September" -> System.out.println("You can go out for " + September.countdays(September.days) + " days in " + str);
            case "October" -> System.out.println("You can go out for " + October.countdays(October.days) + " days in " + str);
            case "November" -> System.out.println("You can go out for " + November.countdays(November.days) + " days in " + str);
            case "December" -> System.out.println("You can go out for " + December.countdays(December.days) + " days in " + str);
        }

    }
}

