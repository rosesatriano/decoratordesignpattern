package decoratordesignpattern;

public abstract class Vehicle {
    protected String description;

    public String toString() {
        return description;
    }

    public abstract double getCost();
}