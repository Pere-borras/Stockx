package edu.poniperro.testStockx.domain.item;
import edu.poniperro.stockx.domain.item.Bid;

import org.junit.Assert;
import org.junit.Test;

public class TestBid {

    @Test
    public void testCrearBid() {
        Bid bid = new Bid("13", 550);
        Assert.assertEquals("13", bid.size());
        Assert.assertEquals(550, bid.value());
    }
}
