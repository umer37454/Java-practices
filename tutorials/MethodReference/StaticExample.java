package practices.tutorials.MethodReference;

interface MethodReference {
    void say();
}

interface MethodReference2 {
    void say(String message);
}

public class StaticExample {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.say(); // without using lambdas made a whole class

        // now using anonymous
        MethodReference demo1 = new MethodReference() {
            @Override
            public void say() {
                System.out.println("Using anonymous");
                method();
            }
        };

        // using lambdas
        MethodReference demo2 = () -> method();
        MethodReference demo3 = StaticExample::method;

        demo2.say();
        demo3.say();

        Thread t1 = new Thread(() -> method());
        Thread t2 = new Thread(StaticExample::method);

        t1.start();
        t2.start();

        // using method reference where a static meth takes parameter
        MethodReference2 a = StaticExample::method2;
        a.say("Hello");
    }

    public static void method(){
        System.out.println("Static Method Reference");
    }

    public static void method2(String message) {
        System.out.println(message + " is a Message");
    }
}

// If you don't use lambdas expression
class Demo implements MethodReference {
    @Override
    public void say() {
        System.out.println("Without functional Interface");
        StaticExample.method();
    }
}
