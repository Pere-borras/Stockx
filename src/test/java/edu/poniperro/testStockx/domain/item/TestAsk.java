package edu.poniperro.testStockx.domain.item;
import edu.poniperro.stockx.domain.item.Ask;
import org.junit.*;
import org.junit.Test;

public class TestAsk {
    @Test
    public void testCrearAsk() {
        Ask ask = new Ask("13", 550);
        Assert.assertEquals("13", ask.size());
        Assert.assertEquals(550, ask.value());
    }

    @Test
    public void testCompareTo() {
        Ask ask1 = new Ask("13", 550);
        Ask ask2 = new Ask("13", 500);
        Ask ask3 = new Ask("13", 500);
        Assert.assertEquals(1, ask1.compareTo(ask2));
        Assert.assertEquals(-1, ask2.compareTo(ask1));
        Assert.assertEquals(0, ask2.compareTo(ask3));
    }

}
