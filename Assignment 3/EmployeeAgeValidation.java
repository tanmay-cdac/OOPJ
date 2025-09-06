class Employee {
    private int age;

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }
}

public class EmployeeAgeValidation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setAge(17);
        System.out.println("Employee age = " + emp.getAge());
    }
}
