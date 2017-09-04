package pl.core.spring.implementation;
import org.springframework.stereotype.Component;
import pl.core.spring.api.IOrder;

@Component
public class Order implements IOrder {
    private Pizza pizza;

    public Order(Pizza pizza){
        this.pizza = pizza;

    }
    public void printOrder(){
        System.out.println("Pizza to: " + pizza.getName() + ", a cena: " + pizza.getPrice());
    }
}
