/**
 * Class representing a private jet.
 */
public class PrivateJet extends Aircraft {

    /**
     * Constructor for creating a private jet.
     *
     * @param model            the model name of the jet
     * @param capacity         the passenger capacity
     * @param flightRange      the flight range in kilometers
     * @param fuelConsumption  the fuel consumption in liters per hour
     */
    public PrivateJet(String model, int capacity, int flightRange, double fuelConsumption) {
        super(model, capacity, 0, flightRange, fuelConsumption);
    }
}
