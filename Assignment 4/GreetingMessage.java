import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Initial Text: ");
        String initialText = sc.nextLine();

        System.out.print("Text to insert: ");
        String insertText = sc.nextLine();

        System.out.print("Insert Index: ");
        int index = sc.nextInt();
        sc.nextLine();

        System.out.print("Text to Append: ");
        String appendText = sc.nextLine();

        StringBuilder str = new StringBuilder(initialText);
        str.append(" ");
        str.insert(index, insertText + " ");
        str.append(appendText);

        System.out.println(str);

        sc.close();
    }
}
