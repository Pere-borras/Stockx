package edu.poniperro.stockx.domain.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item{
    private final String style;
    private final String name;
    private int sale = 0;
    private int ask = 0;
    private int bid = 0;
    private List<Offer> offers = new ArrayList<Offer>();

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return this.style;
    }

    public String getName() {
        return this.name;
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

    public void setBid(int puja) {
        this.bid = puja;
    }

    public void setAsk(int demanda) {
        this.ask = demanda;
    }

    public void setSale(int venta) {
        this.sale = venta;
    }

    public void add(Offer oferta) {
        offers.add(oferta);
    }

    public List<Offer> offers() {
        return this.offers;
    }


    @Override
    public String toString() {
        return this.name + "\n" +
                "         " + this.style;
    }
}
