import java.util.*;

class DaysInMonthLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month number: ");
        int month = sc.nextInt();

        int days=0;
        switch (month) {
            case 1,3,5,7,8,10,12 -> days = 31;
            case 4,6,9,11 -> days = 30;
            case 2 -> days = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;
            default -> System.out.println("Invalid month");
        }
        System.out.println(days + " days");
    }
}
