import java.util.*;

class CharMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character (A-E): ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'A' -> System.out.println("You selected option A.");
            case 'B' -> System.out.println("You selected option B.");
            case 'C' -> System.out.println("You selected option C.");
            case 'D' -> System.out.println("You selected option D.");
            case 'E' -> System.out.println("You selected option E.");
            default -> System.out.println("Invalid option.");
        }
    }
}
