class Staff {
    String name;
    double salary;

    void setDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println(name + " = " + salary);
    }
}

class TeachingStaff extends Staff {
    String subject;

    void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " = " + subject + ", " + salary);
    }
}

class NonTeachingStaff extends Staff {
    String department;

    void setDepartment(String department) {
        this.department = department;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " = " + department + ", " + salary);
    }
}

public class AcademicStaff {
    public static void main(String[] args) {
        TeachingStaff t = new TeachingStaff();
        t.setDetails("Anita", 50000);
        t.setSubject("Math");
        t.displayInfo();

        NonTeachingStaff n = new NonTeachingStaff();
        n.setDetails("Ramesh", 40000);
        n.setDepartment("Admin");
        n.displayInfo();
    }
}
