package com.sda.springjavapoz4.repository;

import com.sda.springjavapoz4.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {


}
