package pl.core.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jmx.export.annotation.AnnotationJmxAttributeSource;
import pl.core.spring.api.IOrder;
import pl.core.spring.config.Config;
import pl.core.spring.config.autoConfig;
import pl.core.spring.implementation.Pizza;

/**
 * Created by Sowskin on 04.09.2017.
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(autoConfig.class);
        IOrder order = context.getBean(IOrder.class);
        order.printOrder();
    }
}
