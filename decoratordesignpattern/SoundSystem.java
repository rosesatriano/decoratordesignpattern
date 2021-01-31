package decoratordesignpattern;

/**
 * The class SoundSystem extends the class VehicleDecorator.
 * The class VehicleDecorator is a vehicle, therefore
 * the SoundSystem is a vehicle as well. 
 * @author rosesatriano
 */
public class SoundSystem extends VehicleDecorator{
    private Vehicle vehicle;

    /**
     * Here in this constructor, we pass the vehicle 
     * variable to the SoundSystem.
     * @param vehicle Includes this class as a part of
     * a vehicle.
     */
    public SoundSystem(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * In this string, we are taking the string from vehicle 
     * and adding to it here.
     * @return This return adds an extra description to the original
     * description of the vehicle.
     */
    public String toString() {
        return vehicle.toString() + ", awesome sound";
    }

    /**
     * In this constructor of getCost, we implement the cost
     * given with the vehicle and then add the extra cost of the 
     * SoundSystem.
     * @return This returns the added value of the vehicle cost
     * and the given cost of the sound system.
     */
    public double getCost() {
        return vehicle.getCost() + 350;
    }
}
