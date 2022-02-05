package edu.poniperro.stockx.domain.item;

public class Sneaker implements Item{
    private String style;
    private String name;
    private int sale = 0;
    private int ask = 0;
    private int bid = 0;

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public int getAsk() {
        return ask;
    }

    public int getBid() {
        return bid;
    }

    public int getSale() {
        return sale;
    }

    @Override
    public String toString() {
        return this.name + "\n" +
                "         " + this.style;
    }
}
