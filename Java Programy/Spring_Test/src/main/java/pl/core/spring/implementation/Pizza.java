package pl.core.spring.implementation;

import pl.core.spring.api.IPizza;

/**
 * Created by Sowskin on 04.09.2017.
 */
public class Pizza implements IPizza {
    private int price;
    private String name;

    public Pizza(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {

        return price;
    }

    public String getName() {

        return name;
    }

}
