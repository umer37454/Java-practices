package practices.tutorials.ObjectCreations;

class House{
    String name;
    int price;

    public House(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Name:" + this.name + " Price:" + this.price;
    }
}

class Building{
    String name;
    House house;

    public Building(String name, House house){
        this.name = name;
        this.house = house;
    }

    @Override
    protected Building clone() throws CloneNotSupportedException{

        return (Building)super.clone();
    }

    @Override
    public String toString(){
        return "Building Name: " + this.name + " House: " + this.house.toString();
    }
}

public class OtherCloneExample {
    public static void main(String[] args) {
        House room1 = new House("Room No 1", 5400);

        Building building = new Building("Building", room1);
        System.out.println(building);

        try {
            Building building2 = building.clone();
            System.out.println(building2);
        } catch (CloneNotSupportedException e){
            System.out.println("Cloning not supported");
        }
    }
}

