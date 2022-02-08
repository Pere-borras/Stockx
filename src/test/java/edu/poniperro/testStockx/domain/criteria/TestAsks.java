package edu.poniperro.testStockx.domain.criteria;
import edu.poniperro.stockx.domain.item.Ask;
import edu.poniperro.stockx.domain.item.Sneaker;
import org.junit.Assert;
import org.junit.Test;

public class TestAsks {

    @Test
    public void testAsks() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Ask("6", 600));

        Assert.assertEquals(600, sneaker.offers().get(0).value());
        Assert.assertEquals("6", sneaker.offers().get(0).size());
    }
}
