package pl.java.programs;

import org.junit.Test;
import pl.java.programs.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-09-11.
 */
public class ForEachPlaygroundTest {

    @Test

    public void EmpoloyeeStreet() throws Exception {;

        List<Employee> employees = new ArrayList<>();

        Address address1 = new Address("30", "os. Jagiellońskie", "Poznań", "60-223");
        Employee jacek = new Employee("Jacek", "Placek", 24, 2000, address1);
        Address address2 = new Address("20", "os. Czecha", "Rzeszów", "61-552");
        Employee wojtek = new Employee("Wojtek", "Kojtek", 29, 4000, address2);

        employees.add(jacek);
        employees.add(wojtek);

        List<Address> collect = employees.stream().map(Employee::getAddress)
                .filter(address -> address.getCity().startsWith("P"))
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test

    public void anotherMapExample() {
        List<String> strings = Arrays.asList("Piotr", "Pawel", "Jan", "Aga");

        List<String> strings1 = strings.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(strings1);
    }

    @Test
    public void  groupByCities(){
        List<Employee> employees = new ArrayList<>();

        Address address1 = new Address("30", "os. Jagiellońskie", "Poznań", "60-223");
        Employee jacek = new Employee("Jacek", "Placek", 24, 2000, address1);
        Address address2 = new Address("20", "os. Czecha", "Rzeszów", "61-552");
        Employee wojtek = new Employee("Wojtek", "Kojtek", 29, 4000, address2);

        employees.add(jacek);
        employees.add(wojtek);
        Map<String,List<Employee>> group = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getSalary));
        System.out.println(group);
    }


}