abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}

interface BonusEligible {
    double calculateBonus();
}

class PermanentEmployee extends Employee implements BonusEligible {
    private double basicSalary;
    private double hra;

    public PermanentEmployee(String name, int id, double basicSalary, double hra) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    @Override
    double calculateSalary() {
        return basicSalary + hra;
    }

    @Override
    public double calculateBonus() {
        return 0.1 * calculateSalary();
    }
}

class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new PermanentEmployee("Amit", 101, 50000, 5000);
        employees[1] = new PermanentEmployee("Rohit", 102, 40000, 4000);
        employees[2] = new ContractEmployee("Neha", 201, 300, 100);
        employees[3] = new ContractEmployee("Riya", 202, 250, 120);

        for (Employee emp : employees) {
            double salary = emp.calculateSalary();
            System.out.print(emp.name + " Salary = " + salary);

            if (emp instanceof BonusEligible) {
                BonusEligible be = (BonusEligible) emp;
                System.out.println(", Bonus = " + be.calculateBonus());
            } else {
                System.out.println();
            }
        }
    }
}
