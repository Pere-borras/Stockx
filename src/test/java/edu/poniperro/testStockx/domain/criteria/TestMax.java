package edu.poniperro.testStockx.domain.criteria;

import edu.poniperro.stockx.domain.criteria.*;
import edu.poniperro.stockx.domain.item.Ask;
import edu.poniperro.stockx.domain.item.Bid;
import edu.poniperro.stockx.domain.item.Sale;
import edu.poniperro.stockx.domain.item.Sneaker;
import org.junit.Assert;
import org.junit.Test;

public class TestMax {

    // Test de integración de Size, Bids y Max

    @Test
    public void testMax() {
        Sneaker sneaker = new Sneaker("Sneaker MEGA molonas", "Molonaitor 250.000");

        sneaker.add(new Bid("11", 200));
        sneaker.add(new Bid("12", 300));
        sneaker.add(new Bid("11", 185));
        sneaker.add(new Bid("13", 400));
        sneaker.add(new Bid("11", 250));
        sneaker.add(new Bid("11", 1200));
        sneaker.add(new Bid("11", 280));
        sneaker.add(new Bid("15", 350));

        Criteria size = new Size("11");
        Criteria bids = new Bids();
        Criteria max = new Max(size, bids);
        Assert.assertEquals(1, max.checkCriteria(sneaker).size());
        Assert.assertEquals(1200, max.checkCriteria(sneaker).get(0).value());
        Assert.assertEquals("11", max.checkCriteria(sneaker).get(0).size());
    }

    @Test
    // Testing that Max doesn't return a null if there's no bid
    public void testMaxNotOK() {
        Sneaker sneaker = new Sneaker("Sneakers", "Molonaitor 2000");
        sneaker.add(new Sale("11", 200));
        sneaker.add(new Ask("12", 300));

        Criteria size = new Size("11");
        Criteria bids = new Bids();
        Criteria max = new Max(size, bids);

        Assert.assertEquals(0, max.checkCriteria(sneaker).size());
        Assert.assertNotNull(max.checkCriteria(sneaker));
    }
}
