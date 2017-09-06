package pl.patterns.observer;

/**
 * Created by RENT on 2017-09-06.
 */
public abstract class Observer<T> {
    protected T observedObject;

    public abstract void onChange (Object sender, PriceChangedEventArgs e);


}
