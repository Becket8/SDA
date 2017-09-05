package pl.patterns.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Computer {
    private String processor;
    private String hdd;
    private String mainboard;
    private String ram;

    public static class ComputerBuilder{
        private String processor;
        private String hdd;
        private String mainboard;
        private String ram;

        public ComputerBuilder() {
        }

        public ComputerBuilder addProcessor(String processor){
            this.processor = processor;
            return this;
        }
        public ComputerBuilder addHdd(String hdd){
            this.hdd = hdd;
            return this;
        }
        public ComputerBuilder addMainboard(String mainboard){
            this.mainboard = mainboard;
            return this;
        }
        public ComputerBuilder addRam(String ram){
            this.ram = ram;
            return this;
        }
        public Computer build(){
            return new Computer(processor,ram,hdd,mainboard);
        }
    }
}
