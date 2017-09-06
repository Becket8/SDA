package pl.patterns.observer;

/**
 * Created by RENT on 2017-09-06.
 */
public class StockObserver extends Observer<Stock> {

    public StockObserver(Stock stock){
        this.observedObject  = stock;
        stock.attachObserver(this);
    }


    @Override
    public void onChange(Object sender, PriceChangedEventArgs e) {
        System.out.println("Cena sie zmienila: Stara cena " + e.getOldPrice() + ", Nowa cena: " + e.getNewPrice());
    }
}
