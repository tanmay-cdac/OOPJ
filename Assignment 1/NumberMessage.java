import java.util.*;

class NumberMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-5): ");
        int n = sc.nextInt();

        switch (n) {
            case 1 -> System.out.println("You selected option 1.");
            case 2 -> System.out.println("You selected option 2.");
            case 3 -> System.out.println("You selected option 3.");
            case 4 -> System.out.println("You selected option 4.");
            case 5 -> System.out.println("You selected option 5.");
            default -> System.out.println("Invalid option.");
        }

    }
}
