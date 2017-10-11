package pl.sda.poznan.computer;

import java.util.Scanner;

public class SetA5503TU4 extends Builder {
    Scanner sc = new Scanner(System.in);
    @Override
    public void getGPU() {
        System.out.println("Grafika: ");
        Computer.setGPU(sc.nextLine());

    }

    @Override
    public void getHDD() {
        System.out.println("Dysk: ");
        Computer.setHDD(sc.nextLine());
    }

    @Override
    public void getCPU() {
        System.out.println("Procesor: ");
        Computer.setCPU(sc.nextLine());
    }

    @Override
    public void getRAM() {
        System.out.println("RAM: ");
        Computer.setRAM(sc.nextLine());
    }

    @Override
    public void getMotherboard() {
        System.out.println("Płyta główna: ");
        Computer.setMotherboard(sc.nextLine());
    }
}
