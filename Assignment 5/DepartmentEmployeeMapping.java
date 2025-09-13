import java.util.*;

public class DepartmentEmployeeMapping {
    public static void main(String[] args) {
        Map<String, List<String>> departmentMap = new HashMap<>();

        departmentMap.put("IT", new ArrayList<>(Arrays.asList("Amit", "Rohan")));
        departmentMap.put("HR", new ArrayList<>(Arrays.asList("Priya")));

        System.out.print("Department Structure: ");
        int deptCount = 0;
        for (Map.Entry<String, List<String>> entry : departmentMap.entrySet()) {
            System.out.print(entry.getKey() + ": " + String.join(", ", entry.getValue()));
            deptCount++;
            if (deptCount < departmentMap.size()) {
                System.out.print("; ");
            }
        }
    }
}

