package com.sda.springjavapoz4.service;

import com.sda.springjavapoz4.model.User;
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

/**
 * Created by RENT on 2017-10-30.
 */
@Component
public class UserService {
    private List<User> users;

    public UserService() {
        this.users = new ArrayList<>();

    }

    @Autowired
    FirstNameGenerator firstNameGenerator;
    @Autowired
    LastNameGenerator lastNameGenerator;

    @PostConstruct
    public void init() {
        users.add(getExampleUser());
        users.add(getExampleUser());
        users.add(getExampleUser());
        users.add(getExampleUser());
        users.add(getExampleUser());
        users.add(getExampleUser());

    }

    public User getUser(int id) {
        return id >= users.size() ? null : users.get(id);
    }

    public User getExampleUser() {
        User user = new User(1L, firstNameGenerator.getRandomFirstName(), lastNameGenerator.getRandomLastName(), "39333423");
        return user;
    }

    public List<User> getUsersByFirstName(String firstName) {
        List<User> userList = users.stream()
                .filter(user -> user.getFirstName().equals(firstName)).collect(Collectors.toList());
        return userList;
    }

    public List<User> getAllUsers() {

        return users;

    }
}