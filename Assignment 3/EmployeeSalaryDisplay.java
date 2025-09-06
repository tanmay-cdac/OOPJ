class Employee {
    String name;
    double salary;

    void setDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println(name + " Total Salary = " + salary);
    }
}

class Manager extends Employee {
    @Override
    void displaySalary() {
        System.out.println(name + " Total Salary = " + (salary * 1.2));
    }
}

class Developer extends Employee {
    @Override
    void displaySalary() {
        System.out.println(name + " Total Salary = " + (salary * 1.1));
    }
}

public class EmployeeSalaryDisplay {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setDetails("Anita", 50000);
        m.displaySalary();

        Developer d = new Developer();
        d.setDetails("Rohit", 40000);
        d.displaySalary();
    }
}
