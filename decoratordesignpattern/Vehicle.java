package decoratordesignpattern;

/**
 * The class Vehicle sets the basis for our children
 * classes to extend off of. 
 * @param description The string that holds the "description" 
 * of the vehicle.
 * @author rosesatriano
 */
public abstract class Vehicle {
    protected String description;

    /**
     * This string is included here to show that the description
     * will later be set within the child.
     * @return description The name of the type of vehicle will be 
     * returned here from our children classes.
     */
    public String toString() {
        return description;
    }
    
    /**
     * This method getCost is an abstract so it is forced to be 
     * implemented in the children classes.
     */
    public abstract double getCost();
}