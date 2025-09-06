class Employee {
    String name;
    double salary;

    void setDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println(name + " Salary=" + salary);
    }
}

class TeachingStaff extends Employee {
    String subject;

    void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    void displaySalary() {
        System.out.println(name + " Subject=" + subject + ", Salary=" + salary);
    }
}

class Professor extends TeachingStaff {
    String specialization;

    void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    void displaySalary() {
        System.out.println(name + " Subject=" + subject + ", Specialization=" + specialization + ", Salary=" + salary);
    }
}

class Lecturer extends TeachingStaff {
    String department;

    void setDepartment(String department) {
        this.department = department;
    }

    @Override
    void displaySalary() {
        System.out.println(name + " Subject=" + subject + ", Department=" + department + ", Salary=" + salary);
    }
}

public class CollegeStaffHierarchy {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.setDetails("Dr. Sharma", 80000);
        p.setSubject("Math");
        p.setSpecialization("Algebra");
        p.displaySalary();

        Lecturer l = new Lecturer();
        l.setDetails("Ms. Mehta", 50000);
        l.setSubject("Physics");
        l.setDepartment("Science");
        l.displaySalary();
    }
}
