package com.sda.springjavapoz4.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Random;


public class RandomGeneratorNumberService implements NumberGenerator
{
    private int bound;
    private int offset;
    Random random = new Random();


    public RandomGeneratorNumberService(int bound) {
        this(bound,0);
    }

    public RandomGeneratorNumberService(int bound, int offset) {
        this.bound = bound;
        this.offset = offset;
    }

    @Bean
    public int generateNumber() {
        int number = random.nextInt(bound)+ offset;
        return number;
    }

    public void showNumber() {
        System.out.println(generateNumber());
    }
}


