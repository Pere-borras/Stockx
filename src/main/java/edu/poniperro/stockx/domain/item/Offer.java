package edu.poniperro.stockx.domain.item;

public interface Offer {
    public String size();

    public int value();

    public int compareTo(Offer oferta);
}
