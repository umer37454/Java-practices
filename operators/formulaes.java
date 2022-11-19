package practices.operators;

public class formulaes {
    public static void main(String[] args) {

        int n = 85475;

        //modulu always give digit from last depending upon 0000
        n = n % 10000;
        System.out.println(n);

        int a = 79565;
        int f;

        //divide always remove digit from last depending upon 0
        f = a / 10000;
        System.out.println(f);
        a = a % 10000;
        System.out.println(a);
    }
}
