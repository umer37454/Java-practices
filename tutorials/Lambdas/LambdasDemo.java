package practices.tutorials.Lambdas;

interface MyGenericInterface {
    void message(String message);
}

// not using lambdas
class Message implements MyGenericInterface {
    @Override
    public void message(String message) {
        System.out.println(message);
    }
}

public class LambdasDemo {
    public static void main(String[] args) {
        MyGenericInterface genericInterface = new Message();

        // not using lambdas
        printMessage(genericInterface, "Hello");

        // using anonymous class
        printMessage(new MyGenericInterface() {
            @Override
            public void message(String message) {
                System.out.println(message);
            }
        }, "Hello world");

        //using lambdas
        printMessage((message) -> System.out.println(message), "Hello world from lambdas");

        //using method reference
        printMessage(System.out::println, "Hello world from method reference");
    }

    public static void printMessage(MyGenericInterface method, String message){
        method.message(message);
    }
}