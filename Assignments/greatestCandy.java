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
            boolean test = false;
            for (int i : candies) {
                if (candy + extraCandies < i) {
                    test = true;
                    break;
                }
            }

            if (test) {
                list.add(false);
            } else {
                list.add(true);
            }
        }

        return list;
    }
}
