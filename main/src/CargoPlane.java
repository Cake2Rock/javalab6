/**
 * Class representing a cargo plane.
 */
public class CargoPlane extends Aircraft {

    /**
     * Constructor for creating a cargo plane.
     *
     * @param model            the model name of the plane
     * @param cargoWeight      the maximum cargo weight in tons
     * @param flightRange      the flight range in kilometers
     * @param fuelConsumption  the fuel consumption in liters per hour
     */
    public CargoPlane(String model, double cargoWeight, int flightRange, double fuelConsumption) {
        super(model, 0, cargoWeight, flightRange, fuelConsumption);
    }
}
