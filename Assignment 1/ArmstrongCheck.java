import java.util.*;

class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int temp = num, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        }
		else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
