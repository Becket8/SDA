package pl.sda.poznan.computer;

public class SetX001T5 extends Builder {

    @Override
    public void getGPU() {
        Computer.setGPU("NVIDIA");
    }

    @Override
    public void getHDD() {

        Computer.setHDD("SEAGATE");

    }

    @Override
    public void getCPU() {
        Computer.setCPU("INTEL");

    }

    @Override
    public void getRAM() {
        Computer.setRAM("CORSAIR");

    }

    @Override
    public void getMotherboard() {
        Computer.setMotherboard("ASUS");

    }
}
