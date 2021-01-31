package decoratordesignpattern;

/**
 * The class Compact extends from Vehicle. This gives the compact
 * the description and the cost of that vehicle.
 * @author rosesatriano
 */
public class Compact extends Vehicle{

    /**
     * The constructor Compact sets the description to the
     * name of the vehicle.
     */
    public Compact(){
        this.description = "Compact";
    }
    
    /**
     * The getCost is implemented here because it is enforced within 
     * the parent class Vehicle. 
     * @return 15000 This is the price of the compact that is returned 
     * for the cost.
     */
    public double getCost(){
        return 15000;
    }
}