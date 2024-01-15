package practices.tutorials.ObjectCreations;

public class CloneExample implements Cloneable{
    int rollno;
    String name;

    public CloneExample(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    protected CloneExample clone() throws CloneNotSupportedException{
        return (CloneExample) super.clone();
    }
}

class CloneDemo extends CloneExample {

    public CloneDemo(int rollno, String name) {
        super(rollno, name);
    }

    public static void main(String[] args) {
        CloneExample obj = new CloneExample(45, "John Doe");
        try {
            CloneExample obj2 = obj.clone();
        } catch (CloneNotSupportedException e){
            System.out.println("Error occured");
        }
    }
}