package edu.poniperro.stockx.domain.criteria;

import edu.poniperro.stockx.domain.item.Bid;
import edu.poniperro.stockx.domain.item.Item;
import edu.poniperro.stockx.domain.item.Offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MaxBid implements Criteria {

    public MaxBid () {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        ArrayList<Offer> lista_bids = new ArrayList<Offer>();
        ArrayList<Offer> maxbid = new ArrayList<Offer>();

        for (Offer oferta : item.offers()) {
            if (oferta instanceof Bid) {
                lista_bids.add(oferta);
            }
        }

        int index = 1;
        for (Offer oferta : lista_bids) {
            if (index >= lista_bids.size()) {
                break;
            }

            if (oferta.value() > lista_bids.get(index).value());{
                if (maxbid.isEmpty()) {
                    maxbid.add(oferta);
                }
                else if (maxbid.get(0).value() < oferta.value()){
                    maxbid.set(0, oferta);
                }
            }

            index++;
        }
        return maxbid;

    }
}
