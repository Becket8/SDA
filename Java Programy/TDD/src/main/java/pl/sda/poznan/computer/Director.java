package pl.sda.poznan.computer;

public class Director {

    public Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    public Part getComputerSet(){
        return builder.getComputer();
    }
    public void build(){
        builder.setComputer();
        builder.getCPU();
        builder.getGPU();
        builder.getHDD();
        builder.getRAM();
        builder.getMotherboard();
    }
}
