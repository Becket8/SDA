package pl.core.spring.implementation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pl.core.spring.api.IPizza;

@Component
public class Pizza implements IPizza {
    private int price;
    private String name;

    public Pizza(@Value("12") int price,@Value("Diabelska") String name) {
        super();
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
