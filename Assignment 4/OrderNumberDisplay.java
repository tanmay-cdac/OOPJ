import java.util.Scanner;

public class OrderNumberDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        StringBuilder rev = new StringBuilder(text);
        rev.reverse();
        System.out.println(rev);

        sc.close();
    }
}

