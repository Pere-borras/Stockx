package edu.poniperro.stockx.domain.item;

public class Ask implements Offer {
    private String size;
    private int ask;

    public Ask(String size, int ask) {
        this.size = size;
        this.ask = ask;
    }

    @Override
    public int value() {
        return this.ask;
    }

    @Override
    public String size() {
        return this.size;
    }
}