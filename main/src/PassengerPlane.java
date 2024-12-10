/**
 * Class representing a passenger plane.
 */
public class PassengerPlane extends Aircraft {

    /**
     * Constructor for creating a passenger plane.
     *
     * @param model            the model name of the plane
     * @param capacity         the passenger capacity
     * @param flightRange      the flight range in kilometers
     * @param fuelConsumption  the fuel consumption in liters per hour
     */
    public PassengerPlane(String model, int capacity, int flightRange, double fuelConsumption) {
        super(model, capacity, 0, flightRange, fuelConsumption);
    }
}
