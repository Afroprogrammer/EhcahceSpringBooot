package com.example.ehcahcespringbooot.cache;

import com.example.ehcahcespringbooot.model.User;
import com.example.ehcahcespringbooot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class UserCache {

    @Autowired
    UserRepository userRepository;
    @Cacheable(value = "usersCache", key = "#name")
    public User getUser(String name) {
        System.out.println("getting from database............");
        return userRepository.findByName(name);

    }
}
