package pl.core.spring.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.core.spring.api.IOrder;
import pl.core.spring.api.IPizza;
import pl.core.spring.implementation.Order;
import pl.core.spring.implementation.Pizza;

@Configuration
public class Config {

    @Bean
    public IPizza pizza(){
        return new Pizza(15, "Diabelska");
    }

    @Bean
    public IOrder Order(Pizza pizza){
        return new Order(pizza);
    }
}
