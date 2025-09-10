public class DataProcessingCleanup {
    public static void main(String[] args) {
        try {
            throw new Exception("Exception occurred: Invalid input");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Data processing completed");
        }
    }
}
