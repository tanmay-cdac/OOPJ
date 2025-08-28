import java.util.*;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();

        int rev = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        System.out.println("Reversed number: " + rev);
    }
}
