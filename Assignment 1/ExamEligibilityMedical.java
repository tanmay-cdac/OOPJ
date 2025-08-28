import java.util.*;

class ExamEligibilityMedical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Classes held: ");
        int held = sc.nextInt();

        System.out.print("Classes attended: ");
        int attended = sc.nextInt();

        System.out.print("Medical cause (Y/N): ");
        char medical = sc.next().charAt(0);

        float percentage = (attended * 100) / held;

        if (percentage >= 75) {
            System.out.println("Student is allowed to sit for the exam.");
        } else if (medical == 'Y' || medical == 'y') {
            System.out.println("Allowed to sit in exam due to medical cause.");
        } else {
            System.out.println("Not allowed to sit in exam.");
        }
    }
}
