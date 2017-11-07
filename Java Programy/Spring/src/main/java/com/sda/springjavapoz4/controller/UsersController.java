package com.sda.springjavapoz4.controller;

import com.sda.springjavapoz4.model.User;
import com.sda.springjavapoz4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping("/example")
    public ModelAndView Users() {

        System.out.println(userService.getExampleUser());
        return new ModelAndView("user");
    }

    @GetMapping("/{id}")
    public ModelAndView getUser(@PathVariable("id") int id) {
        ModelAndView users = new ModelAndView("user");
        User user = userService.getUser(id);
        users.addObject("user",user);
        return users;
    }

    @GetMapping(params = {"surname"})
    public ModelAndView getUsersByLastName(@RequestParam("surname")String surname){
        System.out.println(surname);
        ModelAndView user = new ModelAndView("users");
        user.addObject("surname",surname);
        return user;
    }
//ODWOLUJAC SIE DO "listOfUser" w htmlu, inaczej nie ebdzei wiedzia skad ma ich brac
    @GetMapping(params = {"firstName"})
    public ModelAndView getUsersByFirstName(@RequestParam("firstName")String firstName){
        ModelAndView user = new ModelAndView("users");
        user.addObject("listOfUsers",userService.getUsersByFirstName(firstName));
        return user;
    }
}
