import java.util.*;

class ReversePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();

        int temp = num, rev = 0;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }

        System.out.println("Reversed number: " + rev);
        if (rev == num){
            System.out.println("Palindrome: Yes");
        }
		else{
            System.out.println("Palindrome: No");
		}
    }
}
