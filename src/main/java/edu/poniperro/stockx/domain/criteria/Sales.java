package edu.poniperro.stockx.domain.criteria;

import edu.poniperro.stockx.domain.item.Item;
import edu.poniperro.stockx.domain.item.Offer;
import edu.poniperro.stockx.domain.item.Sale;

import java.util.List;
import java.util.stream.Collectors;

public class Sales implements Criteria {
    public Sales () {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(o -> o instanceof Sale)
                .collect(Collectors.toList());
    }
}
