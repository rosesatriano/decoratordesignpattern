package decoratordesignpattern;

/**
 * The class VehicleDecorator extends the class Vehicle in order
 * to give the different vehicles whatever option that is extended 
 * from this class. 
 * @author rosesatriano
 */
public abstract class VehicleDecorator extends Vehicle {
    /**
     * This string is placed here to include that anything extended
     * from this class will return a string.
     */
    public abstract String toString();
}
