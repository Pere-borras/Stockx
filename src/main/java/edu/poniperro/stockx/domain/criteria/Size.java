package edu.poniperro.stockx.domain.criteria;

import edu.poniperro.stockx.domain.item.Item;
import edu.poniperro.stockx.domain.item.Offer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Size implements Criteria {
    String size;

    public Size (String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().
                filter(o -> o.size().equals(this.size)).
                collect(Collectors.toList());
    }
}
