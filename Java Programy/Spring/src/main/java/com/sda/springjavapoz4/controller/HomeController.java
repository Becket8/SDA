package com.sda.springjavapoz4.controller;

import com.sda.springjavapoz4.service.RandomGeneratorNumberService;
import com.sda.springjavapoz4.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
public class HomeController {

    @Autowired
    private SomeService someService;

    @Autowired
    private RandomGeneratorNumberService randomGeneratorNumberService;
    @Qualifier("bigNumber")
    @Autowired
    private RandomGeneratorNumberService bigRandomGeneratorNumberService;
    @Qualifier("smallNumber")
    @Autowired
    private RandomGeneratorNumberService smallRandomGeneratorNumberService;

    @Qualifier("aboutService")
    @Autowired
    private SomeService myService;


    public HomeController() {

    }

    @GetMapping("/")
    public ModelAndView home() {
        someService.someAction();
        bigRandomGeneratorNumberService.showNumber();
        bigRandomGeneratorNumberService.showNumber();
        return new ModelAndView("home");
    }

    @GetMapping("/about")
    public ModelAndView about() {
        smallRandomGeneratorNumberService.showNumber();
        smallRandomGeneratorNumberService.showNumber();
        smallRandomGeneratorNumberService.showNumber();
        someService.someAction();
        return new ModelAndView("home");
    }

    @GetMapping("/generate")
    public ModelAndView generate() {

        bigRandomGeneratorNumberService.showNumber();
        return new ModelAndView("home");

    }

    @GetMapping("/bigGenerate")
    public ModelAndView bigGenerate(){
        smallRandomGeneratorNumberService.showNumber();
        return new ModelAndView("home");
    }

    @GetMapping("/smallGenerate")
    public ModelAndView smallGenerate(){
        randomGeneratorNumberService.showNumber();
        return new ModelAndView("home");
    }


}
