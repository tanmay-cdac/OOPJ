import java.util.Scanner;

public class ReportTitle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Original title: ");
        String title = sc.nextLine();

        System.out.print("Department Name: ");
        String dept = sc.nextLine();

        StringBuilder sb = new StringBuilder(title);
        sb.insert(sb.indexOf("Report"), " " + dept);
        System.out.println(sb);

        sc.close();
    }
}

