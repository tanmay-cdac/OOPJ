class Member {
    String name;
    int id;

    void setDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println(name + " ID=" + id);
    }
}

class Teacher extends Member {
    String subject;

    void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " ID=" + id + ", Subject=" + subject);
    }
}

class Student extends Member {
    int grade;

    void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " ID=" + id + ", Grade=" + grade);
    }
}

class StaffMember extends Member {
    String department;

    void setDepartment(String department) {
        this.department = department;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " ID=" + id + ", Department=" + department);
    }
}

public class SchoolMembers {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setDetails("Mr. Kumar", 101);
        t.setSubject("English");
        t.displayInfo();

        Student s = new Student();
        s.setDetails("Riya", 201);
        s.setGrade(10);
        s.displayInfo();

        StaffMember sm = new StaffMember();
        sm.setDetails("Mr. Das", 301);
        sm.setDepartment("Maintenance");
        sm.displayInfo();
    }
}
