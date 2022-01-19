package Sweets;

import Sweets.Sweet;

public class Candy extends Sweet {

    private String type;

    public Candy(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + ", type = " + type;
    }
}
