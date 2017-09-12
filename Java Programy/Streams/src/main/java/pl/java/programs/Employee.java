package pl.java.programs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by RENT on 2017-09-11.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {

    private String name;
    private String surname;
    private int age;
    private double salary;
    private Address address;

    public Employee(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;


    }
}
