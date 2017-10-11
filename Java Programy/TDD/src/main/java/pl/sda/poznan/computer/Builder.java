package pl.sda.poznan.computer;

public abstract class Builder {

    public Part Computer;

    public void setComputer(){
        Computer =  new Part();
    }

    public Part getComputer(){
        return Computer;
    }

    public abstract void getGPU();
    public abstract void getHDD();
    public abstract void getCPU();
    public abstract void getRAM();
    public abstract void getMotherboard();
}
