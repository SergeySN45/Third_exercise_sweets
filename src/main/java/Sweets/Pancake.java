package Sweets;

public class Pancake extends Sweet{

    private double diameter;

    public Pancake(String name, double weight, double price, double diameter) {
        super(name, weight, price);
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return super.toString() + ", diameter = " + diameter;
    }
}
