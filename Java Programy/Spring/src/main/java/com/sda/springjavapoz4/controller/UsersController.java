package com.sda.springjavapoz4.controller;

import com.sda.springjavapoz4.model.User;
import com.sda.springjavapoz4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;
//ModelAttrubute podczas posta, przechwyci odpowiednie pola, ktore przyszly i dopasuje je do obieku, jesli sa
    @PostMapping
    public String saveUser(@ModelAttribute User user){
        userService.addUser(user);
        return "redirect:/users";
    }
    //Jezeli Post leci z czegos innego niz z pliku w  formacie x-www, to
    // zmieniamy ModelAttribute na RequestBody i dodajemy consumes
    @PostMapping(consumes = "application/json")
    public String saveUserJson(@RequestBody User user){
        userService.addUser(user);
        return "redirect:/users";
    }

    @GetMapping
    public ModelAndView getAllUsers(){
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("users",userService.getAllUsers());
    return modelAndView;
    }

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
