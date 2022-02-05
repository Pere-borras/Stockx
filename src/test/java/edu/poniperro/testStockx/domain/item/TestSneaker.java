package edu.poniperro.testStockx.domain.item;
import edu.poniperro.stockx.domain.item.Sneaker;

import org.junit.Assert;
import org.junit.Test;

public class TestSneaker {

    @Test
    public void testCrearSneaker(){
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        Assert.assertEquals("555088-105", sneaker.getStyle());
        Assert.assertEquals("Jordan 1 Retro High Dark Mocha", sneaker.getName());
    }


}
