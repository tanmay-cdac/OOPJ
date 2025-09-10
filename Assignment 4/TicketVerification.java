import java.util.Scanner;

public class TicketVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Ticket Number: ");
        String ticket = sc.nextLine();

        StringBuffer sb = new StringBuffer(ticket);
        sb.reverse();
        System.out.println(sb);

        sc.close();
    }
}
