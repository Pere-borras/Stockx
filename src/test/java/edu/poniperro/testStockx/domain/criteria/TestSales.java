package edu.poniperro.testStockx.domain.criteria;

import edu.poniperro.stockx.domain.criteria.Criteria;
import edu.poniperro.stockx.domain.criteria.Sales;
import edu.poniperro.stockx.domain.item.Ask;
import edu.poniperro.stockx.domain.item.Bid;
import edu.poniperro.stockx.domain.item.Sale;
import edu.poniperro.stockx.domain.item.Sneaker;
import org.junit.Assert;
import org.junit.Test;

public class TestSales {

    @Test
    public void testSales() {
        Sneaker sneaker = new Sneaker("Sneakers molonas", "Sneakinator");
        sneaker.add(new Bid("13", 200));
        sneaker.add(new Ask("10", 150));
        sneaker.add(new Sale("12", 199));

        Criteria sales = new Sales();
        Assert.assertEquals(1, sales.checkCriteria(sneaker).size());
        Assert.assertEquals("12", sales.checkCriteria(sneaker).get(0).size());
        Assert.assertEquals(199, sales.checkCriteria(sneaker).get(0).value());
    }
}
