package practices.tutorials.ObjectCreations;

// factory method to create object
public class Factory {
    public static void main(String[] args) {
        Creator creator = new Child();
        creator.someInfo();

        Creator creator1 = new Child2();
        creator1.someInfo();
    }
}

interface Product{
    void displayInfo();
}

class Mobile implements Product {

    @Override
    public void displayInfo() {
        System.out.println("Mobile Product");
    }
}

class Laptop implements Product{

    @Override
    public void displayInfo() {
        System.out.println("Laptop Product");
    }
}

abstract class Creator {
    abstract Product product();

    public void someInfo(){
        System.out.println("It is expensive");
    }
}

class Child extends Creator {
    public Product product(){
        return new Mobile();
    }
}

class Child2 extends Creator {
    public Product product(){
        return new Laptop();
    }
}



