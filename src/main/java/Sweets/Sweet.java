package Sweets;

public abstract class Sweet {
    private String name;
    private double weight;
    private double price;
    private static double absoluteWeight;
    private static double absolutePrice = 0;

    public Sweet(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        Sweet.absoluteWeight += weight;
        Sweet.absolutePrice += price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public static double getAbsoluteWeight() {
        return absoluteWeight;
    }

    public static double getAbsolutePrice() {
        return absolutePrice;
    }

    @Override
    public String toString() {
        return name + ", it costs " + price + " and it weight is " + weight;
    }
}
