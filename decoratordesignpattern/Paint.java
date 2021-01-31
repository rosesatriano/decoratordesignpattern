package decoratordesignpattern;

/**
 * The class Paint extends the class VehicleDecorator.
 * The class VehicleDecorator is a vehicle, therefore
 * the Paint is a vehicle as well. 
 * @author rosesatriano
 */
public class Paint extends VehicleDecorator{
    private Vehicle vehicle;

    /**
     * Here in this constructor, we pass the vehicle 
     * variable to the Paint.
     * @param vehicle Includes this class as a part of
     * a vehicle.
     */
    public Paint(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * In this string, we are taking the string from vehicle 
     * and adding to it here.
     * @return This return adds an extra description to the original
     * description of the vehicle.
     */
    public String toString() {
        return vehicle.toString() + ", fancy paint";
    }

    /**
     * In this constructor of getCost, we implement the cost
     * given with the vehicle and then add the extra cost of the 
     * paint.
     * @return This returns the added value of the vehicle cost
     * and the given cost of the paint.
     */
    public double getCost() {
        return vehicle.getCost() + 150;
    }

}
