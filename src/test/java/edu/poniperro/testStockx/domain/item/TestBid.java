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

    @Test
    public void testCompareTo() {
        Bid bid1 = new Bid("13", 550);
        Bid bid2 = new Bid("13", 500);
        Bid bid3 = new Bid("13", 500);
        Assert.assertEquals(1, bid1.compareTo(bid2));
        Assert.assertEquals(-1, bid2.compareTo(bid1));
        Assert.assertEquals(0, bid2.compareTo(bid3));
    }
}
