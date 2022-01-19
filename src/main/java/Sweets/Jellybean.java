package Sweets;

public class Jellybean extends Sweet{

    private String color;

    public Jellybean(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + ", color = " + color;
    }
}
