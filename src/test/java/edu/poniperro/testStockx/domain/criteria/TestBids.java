package edu.poniperro.testStockx.domain.criteria;

import edu.poniperro.stockx.domain.criteria.Bids;
import edu.poniperro.stockx.domain.criteria.Criteria;
import edu.poniperro.stockx.domain.item.Ask;
import edu.poniperro.stockx.domain.item.Bid;
import edu.poniperro.stockx.domain.item.Sale;
import edu.poniperro.stockx.domain.item.Sneaker;
import org.junit.Assert;
import org.junit.Test;

public class TestBids {

    @Test
    public void testAsks() {
        Criteria bids = new Bids();
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Ask("6", 600));
        sneaker.add(new Sale("6", 600));
        sneaker.add(new Bid("6", 600));

        Assert.assertEquals(1, bids.checkCriteria(sneaker).size());
        Assert.assertTrue(bids.checkCriteria(sneaker).get(0) instanceof Bid);
    }
}
