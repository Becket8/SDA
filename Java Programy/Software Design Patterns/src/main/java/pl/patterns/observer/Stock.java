package pl.patterns.observer;

import lombok.Getter;


import java.util.ArrayList;
import java.util.List;

@Getter

public class Stock {
    private String name;
    private double price;
    private List<Observer<Stock>> observers = new ArrayList<>();

    public void attachObserver(Observer<Stock> observer) {
        observers.add(observer);
    }

    public Stock(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        if (price == this.price) {
            return;
        }
        double oldPrice = this.price;
        this.price = price;

        PriceChangedEventArgs eventArgs = new PriceChangedEventArgs(oldPrice, price);
        for(Observer o : observers){
            o.onChange(this, eventArgs);
        }

    }
}
