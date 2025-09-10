import java.util.Scanner;

public class PaymentProcessingParse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount as string: ");
        String str = sc.nextLine();

        System.out.print("Additional amount to add: ");
        int add = sc.nextInt();

        int amount = Integer.parseInt(str);
        int total = amount + add;

        System.out.println(amount + " + " + add + " = " + total);

        sc.close();
    }
}

