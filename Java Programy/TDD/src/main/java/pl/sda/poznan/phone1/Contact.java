package pl.sda.poznan.phone1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;


@Getter
@Setter
@NoArgsConstructor
@Slf4j
public class Contact {
    private String name;
    private double number;

    public Contact(String name, double number) {
        this.name = name;
        this.number = number;
    }

    public static Contact createContact(String name, double number) {
        return new Contact(name, number);


    }
}

