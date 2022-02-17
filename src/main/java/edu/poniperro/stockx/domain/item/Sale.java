package edu.poniperro.stockx.domain.item;

public class Sale implements Offer {
    private String size;
    private Integer price;

    public Sale(String size, int price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.price;
    }

    @Override
    public String toString() {
        return "\t" + "\t" + this.size + "\t" + this.price + "\n";
    }

    @Override
    public int compareTo(Offer sale) {
        if (this.price > sale.value()) {
            return 1;
        }
        else if (this.price == sale.value()){
            return 0;
        }
        else {
            return -1;
        }
    }
}
