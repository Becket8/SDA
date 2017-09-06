package pl.patterns.observer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-09-06.
 */
public class StockObserverTest {

    @Test
    public void test(){
        Stock stock = new Stock("Orlen", 10);
    StockObserver orlenObserver = new StockObserver(stock);
    stock.setPrice(20);
    }

}