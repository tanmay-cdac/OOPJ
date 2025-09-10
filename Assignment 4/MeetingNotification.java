import java.util.Scanner;

public class MeetingNotification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base text: ");
        String base = sc.nextLine();

        System.out.print("Text to append: ");
        String append = sc.nextLine();

        StringBuffer sb = new StringBuffer(base);
        sb.append(" ").append(append);
        System.out.println(sb);

        sc.close();
    }
}
