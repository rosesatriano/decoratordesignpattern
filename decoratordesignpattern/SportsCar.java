package decoratordesignpattern;

/**
 * The class SportsCar extends from Vehicle. This gives the sports
 * car the description and the cost of that vehicle.
 * @author rosesatriano
 */
public class SportsCar extends Vehicle{

    /**
     * The constructor SportsCar sets the description to the
     * name of the vehicle.
     */
    public SportsCar(){
        this.description = "Sports Car";
    }
    
    /**
     * The getCost is implemented here because it is enforced within 
     * the parent class Vehicle. 
     * @return 30000 This is the price of the sports car that is returned 
     * for the cost.
     */
    public double getCost(){
        return 30000;
    }
}
