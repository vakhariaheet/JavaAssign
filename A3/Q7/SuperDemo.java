package A3.Q7;

class Employee {

    String name;
    String designation;

    Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
}

class EmployeeWithSalary extends Employee {

    float salary;

    EmployeeWithSalary(String name, String designation, float salary) {
        super(name, designation);
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        EmployeeWithSalary emp = new EmployeeWithSalary("John", "Manager", 50000);
        emp.display();
    }
}
