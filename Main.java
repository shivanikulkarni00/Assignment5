package assi5;
class Person {
    String name;
    int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display general information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass Employee extending Person
class Employee extends Person {
    double salary;

    // Constructor to initialize name, age, and salary
    public Employee(String name, int age, double salary) {
        super(name, age); // Calling parent class constructor
        this.salary = salary;
    }

    // Method to simulate working (to be overridden in HRManager)
    public void work() {
        System.out.println(name + " is working as an employee.");
    }

    // Method to get the salary of the employee
    public double getSalary() {
        return salary;
    }
}

// Subclass HRManager extending Employee
class HRManager extends Employee {
    // Constructor to initialize name, age, and salary
    public HRManager(String name, int age, double salary) {
        super(name, age, salary); // Calling parent class constructor
    }

    // Overriding the work method
    @Override
    public void work() {
        System.out.println(name + " is working as an HR Manager, managing employees.");
    }

    // Method to simulate adding an employee
    public void addEmployee() {
        System.out.println(name + " is adding new employees.");
    }
}

public class Main {
	public static void main(String[] args) {
        // Creating an object of Employee class
        Employee emp = new Employee("John", 30, 50000);
        emp.displayInfo();
        emp.work();
        System.out.println("Salary: $" + emp.getSalary());

        System.out.println();

        // Creating an object of HRManager class
        HRManager hr = new HRManager("Alice", 40, 80000);
        hr.displayInfo();
        hr.work(); // Calls the overridden method in HRManager
        System.out.println("Salary: $" + hr.getSalary());
        hr.addEmployee(); // Specific to HRManager
    }
}
