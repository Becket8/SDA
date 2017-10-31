package com.sda.springjavapoz4.controller;

import com.sda.springjavapoz4.service.CalcService;
import com.sda.springjavapoz4.service.RandomNumbersGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController {
    @Autowired
    private CalcService calcService;
    @Qualifier("smallNumbersGenerator")
    @Autowired
    private RandomNumbersGeneratorService randomNumbersGeneratorService;



    @GetMapping("/calc/add")
    public ModelAndView add(){
        System.out.println(calcService.sum(randomNumbersGeneratorService.generateNumber(), randomNumbersGeneratorService.generateNumber()));

        return new ModelAndView("home");
    }
    @GetMapping("/calc/multiply")
    public ModelAndView multiply(){
        System.out.println(calcService.multiply(randomNumbersGeneratorService.generateNumber(), randomNumbersGeneratorService.generateNumber()));

        return new ModelAndView("home");
    }
    @GetMapping("/calc/counter")
    public ModelAndView counter(){
        calcService.getCounter().entrySet().forEach((entry) ->{
            System.out.println( entry.getKey() + entry.getValue());
        });


        return new ModelAndView("home");
    }
}
