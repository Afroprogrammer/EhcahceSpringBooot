package com.example.ehcahcespringbooot.controller;

import com.example.ehcahcespringbooot.cache.UserCache;
import com.example.ehcahcespringbooot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/search")
public class UserResource {
    @Autowired
    UserCache userCache;

    @GetMapping(value = "/{name}")
    public User getUser(@PathVariable final String name){
        return userCache.getUser(name);
    }
}
