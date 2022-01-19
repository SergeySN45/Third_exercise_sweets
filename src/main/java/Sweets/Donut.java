package Sweets;

public class Donut extends  Sweet{

    private boolean topping;

    public Donut(String name, double weight, double price, boolean topping) {
        super(name, weight, price);
        this.topping = topping;
    }

    public boolean getSize() {
        return topping;
    }

    @Override
    public String toString() {
        return super.toString() + ", topping " + (topping ? "is included" : "isn't included");
    }
}
