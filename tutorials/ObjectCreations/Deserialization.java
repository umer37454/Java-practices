package practices.tutorials.ObjectCreations;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("obj.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Deserialization
            Human someHuman = (Human) ois.readObject();
            System.out.println(someHuman.toString());

            System.out.println("File is deserialized");
        } catch(Exception e){
            System.out.println("Error occurred " + e);
        }
    }
}
