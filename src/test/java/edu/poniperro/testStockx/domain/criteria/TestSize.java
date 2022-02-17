package edu.poniperro.testStockx.domain.criteria;

import edu.poniperro.stockx.domain.criteria.Criteria;
import edu.poniperro.stockx.domain.criteria.Size;
import edu.poniperro.stockx.domain.item.Ask;
import edu.poniperro.stockx.domain.item.Bid;
import edu.poniperro.stockx.domain.item.Sale;
import edu.poniperro.stockx.domain.item.Sneaker;
import org.junit.Assert;
import org.junit.Test;

public class TestSize {

    @Test
    public void testSize() {
        Criteria size = new Size("11");

        Sneaker sneaker = new Sneaker("Sneakers molonas", "Sneakinator");
        sneaker.add(new Bid("11", 200));
        sneaker.add(new Ask("13", 200));
        sneaker.add(new Sale("12", 199));

        Assert.assertEquals(1, size.checkCriteria(sneaker).size());
        Assert.assertEquals("11", size.checkCriteria(sneaker).get(0).size());
    }
}
