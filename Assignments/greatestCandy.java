package practices.Assignments;

import java.util.List;
import java.util.ArrayList;

public class greatestCandy {
    public static void main(String[] args) {
        int[] candies  = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies,extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        for (int candy : candies) {
            boolean test = true;
            for (int i : candies) {
                if (candy + extraCandies < i) {
                    test = false;
                    break;
                }
            }

            if (test) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }
}