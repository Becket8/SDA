package pl.sda.poznan.computer;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new SetA5503TU4();
        Builder builder2 = new SetX001T5();

        System.out.println("Zestaw 1: ");

        director.setBuilder(builder);
        director.build();
        Part zestaw1 = director.getComputerSet();
        zestaw1.show();

        System.out.println("Zestaw 2: ");
        director.setBuilder(builder2);
        director.build();
        Part zestaw2 = director.getComputerSet();

        zestaw2.show();
    }
}
