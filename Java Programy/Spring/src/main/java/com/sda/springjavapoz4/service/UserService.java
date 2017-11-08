package com.sda.springjavapoz4.service;

import com.sda.springjavapoz4.model.User;
import com.sda.springjavapoz4.repository.UserRepository;
import com.sda.springjavapoz4.service.generator.FirstNameGenerator;
import com.sda.springjavapoz4.service.generator.LastNameGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by RENT on 2017-10-30.
 */
@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService() {


    }

    @Autowired
    FirstNameGenerator firstNameGenerator;
    @Autowired
    LastNameGenerator lastNameGenerator;

    @PostConstruct
    public void init() {
        userRepository.save(getExampleUser());
        userRepository.save(getExampleUser());
        userRepository.save(getExampleUser());
        userRepository.save(getExampleUser());
        userRepository.save(getExampleUser());
        userRepository.save(getExampleUser());
        userRepository.save(getExampleUser());
        userRepository.findAll().forEach(user -> System.out.println(user));

        //users.forEach(System.out::println);
    }

    public User getUser(int id) {
        return userRepository.findOne((long)id);
    }

    public User getExampleUser() {
        User user = new User(firstNameGenerator.getRandomFirstName(), lastNameGenerator.getRandomLastName(), "39333423");
        return user;
    }

    public List<User> getUsersByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }

    public List<User> getAllUsers() {
        List<User> userList = StreamSupport.stream(userRepository.findAll().spliterator(),false).collect(Collectors.toList());
        return userList;

    }

    public void addUser(User user) {
        userRepository.save(user);
    }
}