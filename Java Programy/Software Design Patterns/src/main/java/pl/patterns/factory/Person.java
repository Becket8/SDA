package pl.patterns.factory;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Person {
    private String name;
    private String surname;
    private Date birthdate;

    public Person(String name, String surname, Date birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }
}
