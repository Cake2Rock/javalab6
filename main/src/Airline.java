import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Class representing an airline with a fleet of aircraft.
 */
public class Airline {
    private List<Aircraft> fleet; // List of aircraft in the fleet

    /**
     * Constructor for initializing an empty fleet.
     */
    public Airline() {
        fleet = new ArrayList<>();
    }

    /**
     * Adds an aircraft to the fleet.
     *
     * @param aircraft the aircraft to add
     */
    public void addAircraft(Aircraft aircraft) {
        fleet.add(aircraft);
    }

    /**
     * Calculates the total passenger capacity of the fleet.
     *
     * @return total passenger capacity
     */
    public int calculateTotalCapacity() {
        return fleet.stream().mapToInt(Aircraft::getCapacity).sum();
    }

    /**
     * Calculates the total cargo weight capacity of the fleet.
     *
     * @return total cargo weight in tons
     */
    public double calculateTotalCargoWeight() {
        return fleet.stream().mapToDouble(Aircraft::getCargoWeight).sum();
    }

    /**
     * Sorts the fleet by flight range in ascending order.
     */
    public void sortFleetByFlightRange() {
        fleet.sort(Comparator.comparingInt(Aircraft::getFlightRange));
    }

    /**
     * Finds aircraft in the fleet with fuel consumption within a specified range.
     *
     * @param minFuel the minimum fuel consumption
     * @param maxFuel the maximum fuel consumption
     * @return list of aircraft matching the criteria
     */
    public List<Aircraft> findAircraftByFuelConsumption(double minFuel, double maxFuel) {
        List<Aircraft> result = new ArrayList<>();
        for (Aircraft aircraft : fleet) {
            if (aircraft.getFuelConsumption() >= minFuel && aircraft.getFuelConsumption() <= maxFuel) {
                result.add(aircraft);
            }
        }
        return result;
    }

    /**
     * Prints the details of all aircraft in the fleet.
     */
    public void printFleet() {
        for (Aircraft aircraft : fleet) {
            System.out.println(aircraft);
        }
    }
}
