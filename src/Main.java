import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display Bogies after Addition
        System.out.println("\nPassenger Bogies after adding:");
        System.out.println(passengerBogies);

        // Remove one Bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Display after Removal
        System.out.println("\nPassenger Bogies after removal:");
        System.out.println(passengerBogies);

        // Check if Sleeper exists
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes Sleeper bogie exist? " + exists);

        // Final State
        System.out.println("\nFinal Passenger Bogies List:");
        System.out.println(passengerBogies);
    }
}