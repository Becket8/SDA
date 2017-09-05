package pl.patterns.builder;

import lombok.AllArgsConstructor;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-09-05.
 */
public class ComputerTest {
    @Test
    public void test(){
        Computer computer =  new Computer.ComputerBuilder()
                .addProcessor("Intel i7")
                .addMainboard("Asus H270")
                .addHdd("Seagate 1TB")
                .addRam("16 Gb").build();




    }
    @Test
    public void builderTest(){
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder();
            builder.addMainboard("Intel G71");
            builder.addRam("16gb ddr4 2133 Ghz");
    }

}