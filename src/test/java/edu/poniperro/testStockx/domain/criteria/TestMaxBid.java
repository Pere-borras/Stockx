package edu.poniperro.testStockx.domain.criteria;

import edu.poniperro.stockx.domain.criteria.Criteria;
import edu.poniperro.stockx.domain.criteria.MaxBid;
import edu.poniperro.stockx.domain.item.Ask;
import edu.poniperro.stockx.domain.item.Bid;
import edu.poniperro.stockx.domain.item.Sale;
import edu.poniperro.stockx.domain.item.Sneaker;
import org.junit.Assert;
import org.junit.Test;

public class TestMaxBid {
    @Test
    public void testMaxBid() {
        Sneaker sneaker = new Sneaker("Sneakers", "Molonaitor 2000");
        Criteria max = new MaxBid();

        sneaker.add(new Sale("11", 200));
        sneaker.add(new Sale("12", 300));
        sneaker.add(new Bid("11", 185));
        sneaker.add(new Ask("13", 400));
        sneaker.add(new Ask("11", 250));
        sneaker.add(new Bid("11", 1200));
        sneaker.add(new Bid("11", 280));
        sneaker.add(new Bid("15", 350));

        Assert.assertEquals(1, max.checkCriteria(sneaker).size());
        Assert.assertEquals(1200, max.checkCriteria(sneaker).get(0).value());
    }

    @Test
    public void testMaxBidEmpty() {
        Sneaker sneaker = new Sneaker("Sneakers", "Molonaitor 2000");
        Criteria max = new MaxBid();

        sneaker.add(new Sale("11", 200));
        sneaker.add(new Ask("12", 300));

        Assert.assertEquals(0, max.checkCriteria(sneaker).size());
        Assert.assertNotNull(max.checkCriteria(sneaker));
    }
}
