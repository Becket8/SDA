package com.sda.springjavapoz4.service.generator;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Component
public class LastNameGenerator {

    List<String> lastName;

    public LastNameGenerator() {
        lastName = new ArrayList<>();
        lastName.add("kwoka");
        lastName.add("posoka");
        lastName.add("burak");
        lastName.add("kielbas");
        lastName.add("madzio");
        lastName.add("sliwka");
    }

    public String getRandomLastName(){

        Random random = new Random();
        String randomLastName = lastName.get(random.nextInt(lastName.size()));

    return randomLastName;
    }
}
