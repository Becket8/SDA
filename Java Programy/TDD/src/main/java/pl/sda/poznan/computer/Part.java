package pl.sda.poznan.computer;

public class Part {

    private String GPU;
    private String HDD;
    private String CPU;
    private String RAM;
    private String Motherboard;


    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setMotherboard(String motherboard) {
        Motherboard = motherboard;
    }

    public void show() {
        System.out.println(GPU + "\n" + HDD + "\n" + CPU + "\n" + RAM + "\n" + Motherboard);
    }
}
