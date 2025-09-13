import java.util.*;

class EmployeeSal implements Comparable<EmployeeSal> {
    private String name;
    private double salary;

    public EmployeeSal(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(EmployeeSal other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return name + ":" + salary;
    }
}

public class EmployeeSalarySorting {
    public static void main(String[] args) {
        List<EmployeeSal> employees = new ArrayList<>();

        employees.add(new EmployeeSal("Amit", 50000));
        employees.add(new EmployeeSal("Priya", 60000));
        employees.add(new EmployeeSal("Rohan", 45000));

        Collections.sort(employees);

        System.out.print("Sorted by salary: ");
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i)+" ");
        }
    }
}
