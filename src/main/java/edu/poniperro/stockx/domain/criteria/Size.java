package edu.poniperro.stockx.domain.criteria;

import edu.poniperro.stockx.domain.item.Item;
import edu.poniperro.stockx.domain.item.Offer;

import java.util.ArrayList;
import java.util.List;

public class Size implements Criteria {
    String size;

    public Size (String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        ArrayList<Offer> lista_size = new ArrayList<Offer>();

        for (Offer oferta : item.offers()) {
            if (oferta.size().equals(this.size)) {
                lista_size.add(oferta);
            }
        }
        return lista_size;
    }
}
