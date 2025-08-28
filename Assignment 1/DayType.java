import java.util.*;

class DayType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day type (1-Workday, 2-Weekend): ");
        int type = sc.nextInt();

        switch (type) {
            case 1 -> System.out.println("It's a workday. Get to work!");
            case 2 -> System.out.println("It's weekend. No work today.");
            default -> System.out.println("Invalid choice.");
        }

    }
}
