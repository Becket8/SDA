package pl.patterns.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PriceChangedEventArgs {
    private double oldPrice;
    private double newPrice;


    public double PriceChange() {
        double PercentPrice = Math.abs((this.newPrice / this.oldPrice) * 100);


    return  PercentPrice;
    }
}