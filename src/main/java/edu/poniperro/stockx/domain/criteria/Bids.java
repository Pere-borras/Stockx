package edu.poniperro.stockx.domain.criteria;

import edu.poniperro.stockx.domain.item.Bid;
import edu.poniperro.stockx.domain.item.Item;
import edu.poniperro.stockx.domain.item.Offer;

import java.util.ArrayList;
import java.util.List;

public class Bids implements Criteria {
    public Bids() {}

    public List<Offer> checkCriteria(Item item) {
        ArrayList<Offer> lista_bids = new ArrayList<Offer>();

        for (Offer oferta : item.offers()) {
            if (oferta instanceof Bid) {
                lista_bids.add(oferta);
            }
        }
        return lista_bids;
    }
}
