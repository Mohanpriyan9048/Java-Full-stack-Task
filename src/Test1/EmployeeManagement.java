package Test1;

public class EmployeeManagement {
    public static void main(String[] args) {
        Manager mgr = new Manager(101, "Alice Smith", "Human Resources");
        Developer dev = new Developer(102, "Bob Jones", "Java");

        System.out.println("--- Manager Details ---");
        mgr.displayDetails();

        System.out.println("\n--- Developer Details ---");
        dev.displayDetails();
    }
}
class Employee {
    int employeeId;
    String name;
    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}
class Manager extends Employee {
    String department; 

    public Manager(int employeeId, String name, String department) {
        super(employeeId, name); 
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    String programmingLanguage; 

    public Developer(int employeeId, String name, String programmingLanguage) {
        super(employeeId, name); 
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Primary Language: " + programmingLanguage);
    }
}
