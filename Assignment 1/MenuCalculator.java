import java.util.*;

class MenuCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select operation: ");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double result;
        switch (choice) {
            case 1 -> result = a + b;
            case 2 -> result = a - b;
            case 3 -> result = a * b;
            case 4 -> result = (b != 0) ? a / b : Double.NaN;
            default -> { System.out.println("Invalid choice"); return; }
        }
        System.out.println("Result: " + result);
    }
}
