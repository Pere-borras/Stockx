package edu.poniperro.stockx.domain.criteria;

import edu.poniperro.stockx.domain.item.Item;
import edu.poniperro.stockx.domain.item.Offer;
import edu.poniperro.stockx.domain.item.Sale;

import java.util.ArrayList;
import java.util.List;

public class LastSale implements Criteria {
    public LastSale (){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        ArrayList<Offer> lista_sales = new ArrayList<Offer>();
        ArrayList<Offer> last_sale = new ArrayList<Offer>();

        for (Offer oferta : item.offers()) {
            if (oferta instanceof Sale) {
                lista_sales.add(oferta);
            }
        }

        last_sale.add(lista_sales.get(lista_sales.size() - 1));

        return last_sale;
    }
}
