package Oops.Super;
class Employee {
    int id;
    String name;

    Employee(int id, String name) {
       
        this.name = name;
        this.salary = salary;
    }
    void show() {
        System.out.println(id + " " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(salary, name);
        this.department = department;
    }


void show() {
    System.out.println(name + " " + salary + " " + department);
}
}

public class classes {
    public static void main(String[] args) {
        Manager m1 = new Manager("Aman", 50000, "IT");
        m1.show();
    }
}