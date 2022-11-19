package practices.operators;

public class marks_percent {
    public static void main(String[] args) {
        float eng = 45;
        float sci = 78;
        float math = 62;
        float total = eng+sci+math;
        float percent = total/300 * 100;

        System.out.println("Total marks " + total);
        System.out.println("Percent " + percent);
    }
}
