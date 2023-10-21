package com.diegojunio.SpringBootJPA.controllers;

import com.diegojunio.SpringBootJPA.entities.Users;
import com.diegojunio.SpringBootJPA.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DataRequests {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<Users> getUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public Optional<Users> getUsersByEmail(@PathVariable("id") Integer id){
        return userRepository.findById(id);
    }
}
