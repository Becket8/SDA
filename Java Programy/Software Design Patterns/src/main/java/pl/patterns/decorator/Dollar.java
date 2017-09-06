package pl.patterns.decorator;

/**
 * Created by RENT on 2017-09-06.
 */
public class Dollar implements Currency {
    @Override
    public String getName() {
        return "This is Dollar";
    }
}
