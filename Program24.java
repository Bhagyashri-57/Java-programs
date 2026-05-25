class Employee {

    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        int bonus = 5000;

        System.out.println("Name: " + name);
        System.out.println("Total Salary: " + (salary + bonus));
    }
}

public class Program24 {
    public static void main(String[] args) {

        Employee e = new Employee("Bhagya", 30000);
        e.display();
    }
}
