package edu.poniperro.stockx.domain.criteria;

import edu.poniperro.stockx.domain.item.Item;
import edu.poniperro.stockx.domain.item.Offer;

import java.util.List;
import java.util.Optional;

public class Min implements Criteria {
    private Criteria criteria;
    private Criteria anotherCriteria;
    public Min(Criteria criteria, Criteria anotherCriteria){
        this.criteria = criteria;
        this.anotherCriteria = anotherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Criteria andCriteria = new AndCriteria(criteria, anotherCriteria);
        Optional<Offer> offer = andCriteria.checkCriteria(item)
                .stream()
                .min(Offer::compareTo);

        return offer.isPresent()? List.of(offer.get()) : List.of();
    }
}
