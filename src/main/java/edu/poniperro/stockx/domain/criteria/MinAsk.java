package edu.poniperro.stockx.domain.criteria;

import edu.poniperro.stockx.domain.item.Ask;
import edu.poniperro.stockx.domain.item.Item;
import edu.poniperro.stockx.domain.item.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class MinAsk implements Criteria {
    public MinAsk() {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> minask = item.offers().
                stream().
                filter(o -> o instanceof Ask).
                min(Offer::compareTo).
                stream().
                collect(Collectors.toList());

        return minask;
    }
}
