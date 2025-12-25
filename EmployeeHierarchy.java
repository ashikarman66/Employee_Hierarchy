class Employee {
    String name;
    int id;
    double basicSalary;

    Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int id, double basicSalary, String department) {
        super(name, id, basicSalary);
        this.department = department;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        Employee emp = new Employee("Ashik", 101, 30000);
        emp.displayInfo();

        System.out.println();

        Employee mgr = new Manager("Arman", 102, 50000, "IT");
        mgr.displayInfo();
    }
}
