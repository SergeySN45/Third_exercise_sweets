package Sweets;

import java.util.ArrayList;

public class GiftBox{

    private ArrayList<Sweet> box = new ArrayList<>();
    private double weightSweetGift = 0;
    private double priceSweetGift = 0;

    public GiftBox () {}

    public GiftBox (Sweet... someSweet) {
        this.add(someSweet);
    }

    public void add(Sweet... someSweet) {
        for (Sweet sweet: someSweet) {
            this.box.add(sweet);
        }
    }

    public double getWeight() {
        this.weightSweetGift = 0;
        for (Sweet sweet: box) {
            this.weightSweetGift += sweet.getWeight();
        }
        return this.weightSweetGift;
    }

    public double getPrice() {
        this.priceSweetGift = 0;
        for (Sweet sweet: box) {
            this.priceSweetGift += sweet.getPrice();
        }
        return this.priceSweetGift;
    }

    @Override
    public String toString() {
        String giftInform = "Gift consist of \n";
        for (Sweet sweet: box) {
            giftInform += sweet.toString() + "\n";
        }
        return giftInform;
    }
}
