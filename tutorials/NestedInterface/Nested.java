package practices.tutorials.NestedInterface;

public interface Nested {
    abstract void run();
    abstract void msg();

    interface InnerInterface{
        abstract void show();
    }
}
