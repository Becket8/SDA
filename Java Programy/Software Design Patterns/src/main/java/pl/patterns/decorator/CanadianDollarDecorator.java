package pl.patterns.decorator;

/**
 * Created by RENT on 2017-09-06.
 */
public class CanadianDollarDecorator implements Decorator {
    private Currency currency;

    public CanadianDollarDecorator(Currency currency){
        this.currency = currency;
    }

    @Override
    public String getName() {
        return currency.getName() + ", it is a Canadian Dollar";
    }


}
