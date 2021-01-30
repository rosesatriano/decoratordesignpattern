package decoratordesignpattern;

public class Sedan extends Vehicle{

    public Sedan(){
        this.description = "Sedan";
    }
    
    public double getCost(){
        return 20000;
    }
}
