package com.example.ehcahcespringbooot.repository;

import com.example.ehcahcespringbooot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


    User findByName(String name);
}
