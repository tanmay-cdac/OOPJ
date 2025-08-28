import java.util.*;

class TrafficSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light color: ");
        String color = sc.next().toLowerCase();

        switch (color) {
            case "red" -> System.out.println("Stop");
            case "yellow" -> System.out.println("Ready");
            case "green" -> System.out.println("Go");
            default -> System.out.println("Invalid signal color");
        }

    }
}
