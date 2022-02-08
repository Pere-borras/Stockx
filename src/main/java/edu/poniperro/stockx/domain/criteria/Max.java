package edu.poniperro.stockx.domain.criteria;

import edu.poniperro.stockx.domain.item.Item;
import edu.poniperro.stockx.domain.item.Offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Max implements Criteria {
    private Criteria criteria;
    private Criteria anotherCriteria;

    public Max(Criteria size, Criteria bids) {
        this.criteria = size;
        this.anotherCriteria = bids;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Criteria andCriteria = new AndCriteria(criteria, anotherCriteria);
        Optional<Offer> offer = andCriteria.checkCriteria(item)
                .stream()
                .max(Offer::compareTo);
        return offer.isPresent()? List.of(offer.get()) : List.of();
        }
}

