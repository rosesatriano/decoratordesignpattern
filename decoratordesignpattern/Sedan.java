package decoratordesignpattern;

/**
 * The class Sedan extends from Vehicle. This gives the sedan
 * the description and the cost of that vehicle.
 * @author rosesatriano
 */
public class Sedan extends Vehicle{

    /**
     * The constructor Sedan sets the description to the
     * name of the vehicle.
     */
    public Sedan(){
        this.description = "Sedan";
    }
    
    /**
     * The getCost is implemented here because it is enforced within 
     * the parent class Vehicle. 
     * @return 20000 This is the price of the sedan that is returned 
     * for the cost.
     */
    public double getCost(){
        return 20000;
    }
}
