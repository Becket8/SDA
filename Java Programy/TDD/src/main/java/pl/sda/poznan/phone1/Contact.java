package pl.sda.poznan.phone1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Contact {
    private String name;
    private double number;

    public Contact(String name, double number) {
        this.name = name;
        this.number = number;
    }

}

