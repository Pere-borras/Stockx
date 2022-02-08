package edu.poniperro.testStockx.domain.item;

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


}
