package edu.poniperro.stockx.domain.criteria;

import edu.poniperro.stockx.domain.item.Item;
import edu.poniperro.stockx.domain.item.Offer;
import edu.poniperro.stockx.domain.item.Sale;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LastSale implements Criteria {
    public LastSale (){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> lista_sales = item.offers().stream().
                filter(o -> o instanceof Sale).
                collect(Collectors.toList());;
        List<Offer> last_sale = new ArrayList<Offer>();

        last_sale.add(lista_sales.get(lista_sales.size() - 1));

        return last_sale;
    }
}
