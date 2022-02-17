package edu.poniperro.stockx.domain.criteria;

import edu.poniperro.stockx.domain.item.Ask;
import edu.poniperro.stockx.domain.item.Bid;
import edu.poniperro.stockx.domain.item.Item;
import edu.poniperro.stockx.domain.item.Offer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bids implements Criteria {
    public Bids() {}

    public List<Offer> checkCriteria(Item item) {
        return item.offers().
                stream().
                filter(o -> o instanceof Bid).
                collect(Collectors.toList());
    }
}
