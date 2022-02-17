package edu.poniperro.testStockx.domain.item;

import edu.poniperro.stockx.domain.item.Bid;
import edu.poniperro.stockx.domain.item.Sale;
import org.junit.Assert;
import org.junit.Test;

public class TestSale {

    @Test
    public void testCrearSale() {
        Sale sale = new Sale("9,5", 200);
        Assert.assertEquals("9,5", sale.size());
        Assert.assertEquals(200, sale.value());
    }

    @Test
    public void testCompareTo() {
        Sale sale1 = new Sale("13", 550);
        Sale sale2 = new Sale("13", 500);
        Sale sale3 = new Sale("13", 500);
        Assert.assertEquals(1, sale1.compareTo(sale2));
        Assert.assertEquals(-1, sale2.compareTo(sale1));
        Assert.assertEquals(0, sale2.compareTo(sale3));
    }


}
