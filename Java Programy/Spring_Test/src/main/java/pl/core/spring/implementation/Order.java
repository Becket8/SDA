package pl.core.spring.implementation;

import pl.core.spring.api.IOrder;

public class Order implements IOrder {
    private Pizza pizza;

    public Order(Pizza pizza){
        this.pizza = pizza;

    }
    public void printOrder(){
        System.out.println("Pizza to: " + pizza.getName() + ", a cena: " + pizza.getPrice());
    }
}
