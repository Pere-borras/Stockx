package edu.poniperro.stockx.domain.criteria;

import edu.poniperro.stockx.domain.item.Ask;
import edu.poniperro.stockx.domain.item.Item;
import edu.poniperro.stockx.domain.item.Offer;

import java.util.ArrayList;
import java.util.List;

public class Asks implements Criteria {
    public Asks() {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        ArrayList<Offer> lista_asks = new ArrayList<Offer>();

        for (Offer oferta : item.offers()) {
            if (oferta instanceof Ask) {
                lista_asks.add(oferta);
            }
        }
        return lista_asks;
    }
}
