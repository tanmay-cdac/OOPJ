class Employee {
    String name;
    double basicSalary;

    void setDetails(String name, double salary) {
        this.name = name;
        this.basicSalary = salary;
    }

    void displayNetSalary() {
        System.out.println(name + " Net Salary = " + basicSalary);
    }
}

class RegularEmployee extends Employee {
    @Override
    void displayNetSalary() {
        double hra = basicSalary * 0.10;
        System.out.println(name + " Net Salary = " + (basicSalary + hra));
    }
}

class ContractEmployee extends Employee {
    @Override
    void displayNetSalary() {
        double allowance = basicSalary * 0.05;
        System.out.println(name + " Net Salary = " + (basicSalary + allowance));
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        RegularEmployee r = new RegularEmployee();
        r.setDetails("Rahul", 20000);
        r.displayNetSalary();

        ContractEmployee c = new ContractEmployee();
        c.setDetails("Riya", 15000);
        c.displayNetSalary();
    }
}
