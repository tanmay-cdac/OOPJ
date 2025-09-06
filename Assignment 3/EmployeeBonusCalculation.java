abstract class Employee {
    String name;
    double salary;

    void setDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void calculateBonus();
}

class Manager extends Employee {
    @Override
    void calculateBonus() {
        System.out.println(name + " Bonus = " + (salary * 0.2));
    }
}

class Developer extends Employee {
    @Override
    void calculateBonus() {
        System.out.println(name + " Bonus = " + (salary * 0.1));
    }
}

public class EmployeeBonusCalculation {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setDetails("Anita", 50000);
        m.calculateBonus();

        Developer d = new Developer();
        d.setDetails("Rohit", 40000);
        d.calculateBonus();
    }
}
