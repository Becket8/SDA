package pl.sda.poznan.phone1;

/**
 * Created by RENT on 2017-08-31.
 */
public class Contact {
    private String name;
    private double number;

    public Contact(String name, double number) {
        this.name = name;
        this.number = number;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
