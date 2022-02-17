package edu.poniperro.stockx.domain.criteria;

import edu.poniperro.stockx.domain.item.Bid;
import edu.poniperro.stockx.domain.item.Item;
import edu.poniperro.stockx.domain.item.Offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxBid implements Criteria {

    public MaxBid () {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> maxbid = item.offers().
                stream().
                filter(o -> o instanceof Bid).
                max(Offer::compareTo).
                stream().
                collect(Collectors.toList());

        return maxbid;

    }
}
