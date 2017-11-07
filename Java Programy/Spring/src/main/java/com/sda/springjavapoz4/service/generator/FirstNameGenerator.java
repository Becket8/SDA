package com.sda.springjavapoz4.service.generator;


import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FirstNameGenerator {

    private List<String> names;

    public FirstNameGenerator() {
        this.names = new ArrayList<>();
        names.add("jan");
        names.add("maciek");
        names.add("konrad");
        names.add("pawel");
        names.add("szymon");
        names.add("seba");
        names.add("filip");
    }


    public String getRandomFirstName() {

        Random random = new Random();
        String randomNames = names.get(random.nextInt(names.size()));

        return randomNames;
    }

}
