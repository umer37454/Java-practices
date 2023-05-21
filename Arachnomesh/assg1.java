package practices.Arachnomesh;

public class assg1 {
  public static void main(String[] args) {
    int[] arr = {1,3,2,4,5};
    int sum = 0;
    int avg = 1;
    int count = 0;

    for (int j : arr) {
      sum = sum + j;
    }

    avg = (sum / arr.length) * avg;

    for (int j : arr) {
      if (j == avg) {
        count++;
      }
    }

    System.out.println("It contains " + count +  " " + avg +  " element");
  }
}
