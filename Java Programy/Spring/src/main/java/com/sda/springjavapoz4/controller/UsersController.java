package com.sda.springjavapoz4.controller;

import com.sda.springjavapoz4.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {

    @Autowired
private SomeService someService;

        @GetMapping("/users")
        public ModelAndView users () {
            someService.someAction();
            return new ModelAndView("home");
        }
        @GetMapping("/contact-us")
        private  ModelAndView contactUs(){
            return new ModelAndView("home");

        }



}