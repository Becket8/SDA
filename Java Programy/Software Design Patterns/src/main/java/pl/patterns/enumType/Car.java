package pl.patterns.enumType;

public class Car {

    private String mark;
    private String model;
    private Colour colour;

    public Car() {

    }

    public Car(String mark, String model, Colour colour) {
        this.mark = mark;
        this.model = model;
        this.colour = colour;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
}
