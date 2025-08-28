import java.util.*;

class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();

        int a = num / 1000;           
        int b = (num / 100) % 10;      
        int c = (num / 10) % 10;       
        int d = num % 10;              

        if ((a + b) == (c + d)) {
            System.out.println("Lucky number");
        } else {
            System.out.println("Not a lucky number");
        }
    }
}
