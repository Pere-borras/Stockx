package edu.poniperro.testStockx.domain.criteria;

import edu.poniperro.stockx.domain.criteria.*;
import edu.poniperro.stockx.domain.item.Ask;
import edu.poniperro.stockx.domain.item.Sneaker;
import org.junit.Assert;
import org.junit.Test;

public class TestMin {

    // Test de integración de Size, Asks y Min

    @Test
    public void testMin() {
        Sneaker sneaker = new Sneaker("Sneaker Hyper molonas", "OwO");

        sneaker.add(new Ask("11", 200));
        sneaker.add(new Ask("12", 300));
        sneaker.add(new Ask("11", 185));
        sneaker.add(new Ask("13", 400));
        sneaker.add(new Ask("11", 250));
        sneaker.add(new Ask("11", 1200));
        sneaker.add(new Ask("11", 280));
        sneaker.add(new Ask("15", 350));

        Criteria size = new Size("11");
        Criteria bids = new Asks();
        Criteria min = new Min(size, bids);

        Assert.assertEquals(1, min.checkCriteria(sneaker).size());
        Assert.assertEquals(185, min.checkCriteria(sneaker).get(0).value());
        Assert.assertEquals("11", min.checkCriteria(sneaker).get(0).size());


    }
}
