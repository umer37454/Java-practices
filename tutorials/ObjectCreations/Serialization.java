package practices.tutorials.ObjectCreations;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Human implements Serializable {
    String name;
    int age;

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void doSomething(){
        System.out.println(this.name + " is currently playing soccer");
    }

    @Override
    public String toString(){
        return this.name + this.age;
    }
}

public class Serialization {
    public static void main(String[] args) {
        try {
            Human john = new Human("John Doe", 27);
            FileOutputStream fos = new FileOutputStream("obj.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // serialization of object
            oos.writeObject(john);

            oos.close();
            fos.close();

            System.out.println("File is created");
        } catch(IOException e){
            System.out.println("Error occured " + e);
        }

    }
}
