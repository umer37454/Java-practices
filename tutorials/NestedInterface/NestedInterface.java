package practices.tutorials.NestedInterface;

public class NestedInterface implements Nested, Nested.InnerInterface{
    public static void main(String[] args) {
        NestedInterface nested = new NestedInterface();
        nested.show();
        nested.run();
        nested.msg();
    }

    @Override
    public void show() {
        System.out.println("Nested Class methods");
    }

    @Override
    public void run() {
        System.out.println("Parent Interface Method");
    }

    @Override
    public void msg() {
        System.out.println("Parent Interface method");
    }
}
