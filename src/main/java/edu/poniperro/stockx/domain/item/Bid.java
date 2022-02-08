package edu.poniperro.stockx.domain.item;

public class Bid implements Offer {
    private String size;
    private Integer bid;

    public Bid(String size, Integer bid) {
        this.size = size;
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "\t" + "\t" + this.size + "\t" + this.bid + "\n";
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.bid;
    }

    @Override
    public int compareTo(Offer bid) {
        if (this.bid > bid.value()) {
            return 1;
        }
        else if (this.bid > bid.value()){
            return 0;
        }
        else {
            return -1;
        }
    }

}
