package practices.Arachnomesh;

public class assg3 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2};

        double max = -454145;  // largest num java can hold
        double min = 4578454;  // smallest num java can hold

        for (int j : arr) {
            if (j > max) {
                max = j;
            }

            if (j < min) {
                min = j;
            }
        }

        double avg = (max + min) / 2;
        System.out.println(avg);
    }
}
