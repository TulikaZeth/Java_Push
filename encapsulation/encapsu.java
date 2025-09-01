import java.lang.reflect.Field;

// Abstract class representing an Employee
abstract class Employee {
    private double salary;
    private String name;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    // Abstract methods that must be implemented by subclasses
    public abstract double calculateBonus();
    public abstract String getJobRole();
}

// Concrete class Manager extending Employee
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.2; // 20% bonus for managers
    }

    @Override
    public String getJobRole() {
        return "Manager managing " + teamSize + " employees";
    }
}

// Concrete class Developer extending Employee
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.1; // 10% bonus for developers
    }

    @Override
    public String getJobRole() {
        return "Developer working with " + programmingLanguage;
    }
}

public class encapsu {
    public static void main(String[] args) {
        // Create a Manager instance
        Manager manager = new Manager("John Doe", 60000.0, 5);
        
        // Create a Developer instance
        Developer developer = new Developer("Jane Smith", 50000.0, "Java");
        
        // Demonstrate abstraction through polymorphism
        System.out.println("--- Manager Details ---");
        printEmployeeDetails(manager);
        
        System.out.println("\n--- Developer Details ---");
        printEmployeeDetails(developer);
    }
    
    // Demonstrate abstraction through polymorphism
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Role: " + employee.getJobRole());
        System.out.println("Annual Bonus: $" + employee.calculateBonus());
    }
}
