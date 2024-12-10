import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a custom set
        CustomSet<Aircraft> aircraftSet = new CustomSet<>();

        // Add elements
        aircraftSet.add(new PassengerPlane("Boeing 737", 180, 3000, 2600));
        aircraftSet.add(new CargoPlane("Antonov AN-124", 120, 4800, 5200));
        aircraftSet.add(new PrivateJet("Gulfstream G550", 12, 12000, 1100));

        // Display the set
        System.out.println("Custom Set Contents:");
        for (Aircraft aircraft : aircraftSet) {
            System.out.println(aircraft);
        }

        // Test constructor with a collection
        CustomSet<Aircraft> anotherSet = new CustomSet<>(Arrays.asList(
                new PassengerPlane("Airbus A320", 160, 3500, 2400)
        ));
        System.out.println("\nAnother Set Contents:");
        for (Aircraft aircraft : anotherSet) {
            System.out.println(aircraft);
        }
    }
}
