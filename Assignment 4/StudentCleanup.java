import java.util.Scanner;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println("Student object for " + name + " is being garbage collected");
    }
}

public class StudentCleanup {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student Name: ");
        String name = sc.nextLine();

        Student s = new Student(name);
        s = null;
        System.gc();
        Thread.sleep(100);

        sc.close();
    }
}
