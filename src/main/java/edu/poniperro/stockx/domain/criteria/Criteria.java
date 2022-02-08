package edu.poniperro.stockx.domain.criteria;

import edu.poniperro.stockx.domain.item.Item;
import edu.poniperro.stockx.domain.item.Offer;

import java.util.List;

public interface Criteria {
    public List<Offer> checkCriteria(Item item);
}
