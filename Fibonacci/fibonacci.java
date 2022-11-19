package practices.Fibonacci;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int c = 0;
        int n = 8;

        for (int i = 1; i <=n; i ++){
            System.out.println(c);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
