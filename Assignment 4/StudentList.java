import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            System.out.println("Student list loaded successfully:");
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        sc.close();
    }
}
