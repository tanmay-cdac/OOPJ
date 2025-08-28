import java.util.*;

class SeasonMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "Winter";
        else if (month >= 3 && month <= 5)
            season = "Summer";
        else if (month >= 6 && month <= 8)
            season = "Monsoon";
        else if (month >= 9 && month <= 11)
            season = "Autumn";
        else
            season = "Invalid month";

        System.out.println("Season is " + season);
    }
}
