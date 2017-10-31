package com.sda.springjavapoz4.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@Component
public  class CalcService {

    private  Map<String,Integer> counter;
    private int  mapa;


    public  CalcService(){
        this.counter = new HashMap<>();

    }

    public Integer sum(int a, int b){
        Integer number = a+b;
        counter.put("Sum " + mapa + ": ",number);
        mapa++;
        return number;
    }

    public Integer multiply(int a, int b){
        Integer number = a*b;
        counter.put("Multiply " + mapa + ": ",number);
        mapa++;
        return number;
    }

    public Map<String, Integer> getCounter() {
        return counter;
    }
}
