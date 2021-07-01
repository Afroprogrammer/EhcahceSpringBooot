package com.example.ehcahcespringbooot.loader;

import com.example.ehcahcespringbooot.model.User;
import com.example.ehcahcespringbooot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loader {


    @Autowired
    UserRepository userRepository;

    @PostConstruct
    public void load(){
       List<User> usersList = getList();
        userRepository.saveAll(usersList);

    }
    public List<User> getList() {
        List <User> usersList = new ArrayList<>();
        usersList.add(new User("joshua", "SPG", 123L));
        usersList.add(new User("Erastus", "SPG", 124L));
        usersList.add(new User("Franklin", "SPG", 125L));
        usersList.add(new User("Innocent", "SPG", 126L));
        return usersList;

    }
}
