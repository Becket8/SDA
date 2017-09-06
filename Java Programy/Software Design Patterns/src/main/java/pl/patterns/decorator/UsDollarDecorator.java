package pl.patterns.decorator;

/**
 * Created by RENT on 2017-09-06.
 */
public class UsDollarDecorator implements Decorator {
    private Currency currency;

    public UsDollarDecorator(Currency currency){
        this.currency = currency;
    }
    @Override
    public String getName() {
        return currency.getName() + ", it is US Dollar";
    }
}
