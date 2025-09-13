import java.util.HashSet;
import java.util.Set;

public class ElectronicVotingSystem {
    public static void main(String[] args) {
        Set<Integer> voterID = new HashSet<>();

        voterID.add(201);
        voterID.add(202);
        voterID.add(203);
        voterID.add(202);

        System.out.println("Total voters: " + voterID.size());
    }
}

