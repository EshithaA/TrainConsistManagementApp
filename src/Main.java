import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for Train Formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Add duplicate intentionally
        trainFormation.add("Sleeper"); // duplicate

        // Display final formation
        System.out.println("\nFinal Train Formation (Insertion Order Maintained):");
        System.out.println(trainFormation);
    }
}