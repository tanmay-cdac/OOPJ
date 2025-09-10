import java.util.Scanner;

public class RemoveOutdatedInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Original text: ");
        String original = sc.nextLine();

        System.out.print("Exact substring to delete: ");
        String delete = sc.nextLine();

        StringBuffer sb = new StringBuffer(original);
        int start = sb.indexOf(delete);
        if (start != -1) {
            sb.delete(start, start + delete.length());
        }
        System.out.println(sb);

        sc.close();
    }
}
