package pl.patterns.observer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-09-06.
 */
public class StockObserverTest {

    @Test
    public void test() {
        Stock stock = new Stock("Orlen", 10);
        new AdvanceStockObserver(stock);
        stock.setPrice(20);
        stock.setPrice(10);
        stock.setPrice(40);
        stock.setPrice(30);
    }

}