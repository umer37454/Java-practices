package practices.practices;

import java.util.Scanner;

class Year3 {
    public int countdays2() {
        int i;
        i = 30 / 2;
        return i;
    }

    public int countdays3() {
        int i;
        i = 28 / 2;
        return i;
    }

    public int countdays4() {
        int i;
        i = 31 / 2;
        return i;
    }
}

public class Yearmain {
    public static void main(String[] args) {
        Year3 obj = new Year3();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter month in which you want to go out: ");
            String str = input.next();
            {
                if (str.equals("January") || str.equals("january") ||
                        str.equals("February") || str.equals("february") ||
                        str.equals("March") || str.equals("march") ||
                        str.equals("April") || str.equals("april") ||
                        str.equals("May") || str.equals("may") ||
                        str.equals("June") || str.equals("june") ||
                        str.equals("July") || str.equals("july") ||
                        str.equals("August") || str.equals("august") ||
                        str.equals("September") || str.equals("september") ||
                        str.equals("October") || str.equals("october") ||
                        str.equals("November") || str.equals("november") ||
                        str.equals("December") || str.equals("december")) {
                    if (str.equals("January") || str.equals("january") ||
                            str.equals("March") || str.equals("march") ||
                            str.equals("May") || str.equals("may") ||
                            str.equals("July") || str.equals("july") ||
                            str.equals("August") || str.equals("august") ||
                            str.equals("October") || str.equals("october") ||
                            str.equals("December") || str.equals("december")
                    ) {
                        System.out.println(obj.countdays3());
                    }
                    if (str.equals("April") || str.equals("april") ||
                            str.equals("June") || str.equals("june") ||
                            str.equals("September") || str.equals("september") ||
                            str.equals("November") || str.equals("november")) {
                        System.out.println(obj.countdays2());
                    }
                    if (str.equals("February") || str.equals("february")) {
                        System.out.println(obj.countdays4());
                    }
                } else if (str.equals("X") || str.equals("x")) {
                    break;
                } else {
                    System.out.println("Invalid month");
                }
            }
        }
    }
}
