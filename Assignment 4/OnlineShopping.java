import java.util.Scanner;

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();

        int n = sc.nextInt();
        double[] prices = new double[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }

        int productIndex = sc.nextInt();

        try {
            if (quantity <= 0) {
                throw new ArithmeticException();
            }

            double total = quantity * prices[productIndex];
            System.out.println("Total Price: " + total);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught");
        }

        sc.close();
    }
}

