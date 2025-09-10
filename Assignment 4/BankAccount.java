import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account ID: ");
        final int id = sc.nextInt();

        System.out.println("Account ID = " + id + " (cannot be changed)");

        sc.close();
    }
}
