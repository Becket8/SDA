package pl.patterns.observer;

/**
 * Created by RENT on 2017-09-07.
 */
public class AdvanceStockObserver extends Observer<Stock> {

    protected  AdvanceStockObserver(Stock stock){
        this.observedObject = stock;
        stock.attachObserver(this);

    }

    @Override
    protected void onChange(Stock sender, PriceChangedEventArgs e) {

        System.out.println("Cena sie zmienila: Stara cena " + e.getOldPrice() + ", Nowa cena: " + e.getNewPrice()+". Różnica w cenie to: " + e.PriceChange());
    }
}
