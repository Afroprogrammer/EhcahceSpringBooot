package com.example.ehcahcespringbooot.cache;

import com.example.ehcahcespringbooot.model.User;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByName {
    @Autowired
    UserCache userCache;
    public List<User> twoUser(List users, String names){
        List <String> allNames = Arrays.asList(names.split("\\s*,\\s*"));
        List <User> user1 = users;
        List <User> users2 = user1.stream().filter(a -> allNames.contains(a.getName())).collect(Collectors.toList());
        return users2;
    }
}
