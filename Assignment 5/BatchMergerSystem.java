import java.util.*;

public class BatchMergerSystem {
    public static void main(String[] args) {
        List<String> morningBatch = Arrays.asList("Amit", "Priya");
        List<String> eveningBatch = Arrays.asList("Rohan", "Priya");

        Set<String> combinedBatches = new LinkedHashSet<>();

        combinedBatches.addAll(morningBatch);
        combinedBatches.addAll(eveningBatch);

        System.out.println("Combined batches:");
        for (String student : combinedBatches) {
            System.out.println(student);
        }
    }
}
