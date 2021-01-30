package decoratordesignpattern;

public class Compact extends Vehicle{

    public Compact(){
        this.description = "Compact";
    }
    
    public double getCost(){
        return 15000;
    }
}