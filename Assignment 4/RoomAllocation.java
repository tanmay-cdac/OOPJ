import java.util.Scanner;

public class RoomAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Original text: ");
        String original = sc.nextLine();

        System.out.print("Text to insert: ");
        String insert = sc.nextLine();

        System.out.print("Insert index: ");
        int index = sc.nextInt();
        sc.nextLine();

        StringBuffer sb = new StringBuffer(original);
        sb.insert(index, " "+insert );
        System.out.println(sb);

        sc.close();
    }
}
