package practices.tutorials.ObjectCreations;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

class Person{
    String name;
    int age;

    public Person(){
        this.age = 45;
        this.name = "John Doe";
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class Main {
    public static void main(String[] args) {

        // reflection operation - .class literal to provide information about java class
        Class<Person> personClass = Person.class;
        System.out.println(personClass.getName());
        System.out.println(personClass.getPackageName());

        Constructor<?>[] constructors = personClass.getDeclaredConstructors();

        System.out.println(Arrays.toString(constructors));

        for (Constructor<?> constructor : personClass.getDeclaredConstructors()) {
            System.out.println(constructor.getName());
        }

        try {
            Constructor<Person> personConstructor = personClass.getDeclaredConstructor();
            Constructor<Person> personArgumentConstructor = personClass.getDeclaredConstructor(String.class, int.class);

            // Object creation using newInstance
            Person person = personConstructor.newInstance();
            person.displayInfo();

            Person person1 = personArgumentConstructor.newInstance("Alex Karev", 32);
            person1.displayInfo();

        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e){
            System.out.println("Sorry some error occured");
        }
    }
}
