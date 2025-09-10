import java.util.Scanner;

public class NotificationUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Original text: ");
        String original = sc.nextLine();

        System.out.print("Text to find: ");
        String find = sc.nextLine();

        System.out.print("Replacement text: ");
        String replace = sc.nextLine();

        StringBuilder sb = new StringBuilder(original);
        int start = sb.indexOf(find);
        if (start != -1) {
            sb.replace(start, start + find.length(), replace);
        }
        System.out.println(sb);
        sc.close();
    }
}
