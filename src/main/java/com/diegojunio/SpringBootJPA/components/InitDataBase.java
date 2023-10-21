package com.diegojunio.SpringBootJPA.components;

import com.diegojunio.SpringBootJPA.entities.Users;
import com.diegojunio.SpringBootJPA.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class InitDataBase {
    @Autowired
    UserRepository userRepository;

    @Bean
    public String insertInitDataUsers(){
        insertDataUsers(userRepository);
        return null;
    }

    private void insertDataUsers(UserRepository userRepository){
        userRepository.save(new Users("Diego", "diego@email.com"));
        userRepository.save(new Users("Erick", "erick@email.com"));
        userRepository.save(new Users("Samuel", "samuel@email.com"));
        userRepository.save(new Users("priscila", "priscila@email.com"));
        userRepository.save(new Users("Joao", "joao@email.com"));
    }
}
