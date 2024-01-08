package practices.tutorials.Aggregation;

import java.util.Arrays;

class University {
    public String department;
    public int count;
    public Department[] departments;

    public University(String department, int count){
        this.department = department;
        this.count = count;
        this.departments = new Department[count];
    }

    public void addDepartments(Department department){
        if(departments.length > count){
            for (int i = 1; i <= count; i++) {
                departments[i] = department;
            }
        }
        System.out.println(Arrays.toString(this.departments));
    }
}

class Department {
    public String departmentName;
    public int departmentCount;

    public Department(String departmentName, int departmentCount){
        this.departmentName = departmentName;
        this.departmentCount = departmentCount;
    }

}

public class Main {
    public static void main(String[] args) {
        University Mumbai = new University("Science", 4);

    }
}
