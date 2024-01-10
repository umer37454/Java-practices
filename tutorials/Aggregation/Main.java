package practices.tutorials.Aggregation;

import java.util.Arrays;

class University {
    public String universityName;
    public int count;
    public Department[] departments;

    public University(String universityName, int count){
        this.universityName = universityName;
        this.count = 0;
        this.departments = new Department[count];
    }

    public void addDepartments(Department department){
        if(count < departments.length){
            departments[count] = department;
            count++;
        } else {
            System.out.println("University is full");
        }
    }

    public void getFullUniversityList(){
        System.out.println(Arrays.toString(this.departments));
    }

    @Override
    public String toString() {
        return "University name: " + this.universityName;
    }
}

class Department {
    public String departmentName;

    public Department(String departmentName){
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return this.departmentName;
    }
}

class StateBoards<T, K>{
    public T university;
    public K id;
    Department[] departments;

    public StateBoards(T name, K id){
        this.university = name;
        this.id = id;
    }

    public void print() {
        System.out.println(university);
        System.out.println(id);

        if(university instanceof University){ // checking if it is part of a University class
            this.departments = ((University) university).departments;
        }

        System.out.println("From SateBoard class: " + Arrays.toString(departments));
    }
}

public class Main {
    public static void main(String[] args) {
        Department Science = new Department("Science");
        Department Maths = new Department("Maths");
        Department Economics = new Department("Economics");
        Department Biology = new Department("Biology");

        University Mumbai = new University("Mumbai", 4);

        Mumbai.addDepartments(Science);
        Mumbai.addDepartments(Maths);
        Mumbai.addDepartments(Economics);
        Mumbai.addDepartments(Biology);

        Mumbai.getFullUniversityList();

        StateBoards<University, String> Maharashtra = new StateBoards<>(Mumbai, "#7804");
        Maharashtra.print();

        StateBoards<University, String> exampleGenerics = Main.exampleGenerics();
        exampleGenerics.print();
    }

    public static StateBoards<University,String> exampleGenerics(){
        University republicOfCalifornia = new University("Republic of California", 1);

        StateBoards<University, String> california = new StateBoards<>(republicOfCalifornia, "#4036");
        return california;
    }

    // make generic method here
}
