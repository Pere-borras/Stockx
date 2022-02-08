package edu.poniperro.stockx.domain.criteria;

import edu.poniperro.stockx.domain.item.Ask;
import edu.poniperro.stockx.domain.item.Bid;
import edu.poniperro.stockx.domain.item.Item;
import edu.poniperro.stockx.domain.item.Offer;

import java.util.ArrayList;
import java.util.List;

public class MinAsk implements Criteria {
    public MinAsk() {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        ArrayList<Offer> lista_asks = new ArrayList<Offer>();
        ArrayList<Offer> minask = new ArrayList<Offer>();

        for (Offer oferta : item.offers()) {
            if (oferta instanceof Ask) {
                lista_asks.add(oferta);
            }
        }

        int index = 1;
        for (Offer oferta : lista_asks) {
            if (index >= lista_asks.size()) {
                break;
            }

            if (oferta.value() < lista_asks.get(index).value());{
                if (minask.isEmpty()) {
                    minask.add(oferta);
                }
                else if (minask.get(0).value() > oferta.value()){
                    minask.set(0, oferta);
                }
            }

            index++;
        }
        return minask;
    }
}
