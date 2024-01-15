package practices.tutorials.ObjectCreations;

public class CloneExample implements Cloneable{
    int rollno;
    String name;
    Person refrenceObject;

    public CloneExample(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello from Clone Example");
    }

    @Override
    protected CloneExample clone() throws CloneNotSupportedException{
        CloneExample cloned = (CloneExample) super.clone();
        cloned.refrenceObject = new Person("Cloned", 42);
        return cloned;
    }

    @Override
    public String toString(){
        return "Roll no." + this.rollno + " Name.";
    }
}

class CloneDemo extends CloneExample {

    public CloneDemo(int rollno, String name) {
        super(rollno, name);
    }

    public void childHello(){
        super.sayHello();
    }

    public static void main(String[] args) {
        CloneDemo obj = new CloneDemo(45, "John Doe");
        obj.childHello();
        System.out.println(obj);

        // Cloning of object
        try {
            CloneExample obj2 = obj.clone();
            System.out.println(obj2);
        } catch (CloneNotSupportedException e){
            System.out.println("Error occured");
        }
    }
}