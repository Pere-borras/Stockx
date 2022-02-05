package edu.poniperro.testStockx.domain.item;
import edu.poniperro.stockx.domain.item.Ask;

import org.junit.Assert;
import org.junit.Test;

public class TestAsk {
    @Test
    public void testCrearAsk() {
        Ask ask = new Ask("13", 550);
        Assert.assertEquals("13", ask.size());
        Assert.assertEquals(550, ask.value());
    }
}
