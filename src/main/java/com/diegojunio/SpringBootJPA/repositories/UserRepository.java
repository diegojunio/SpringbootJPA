package com.diegojunio.SpringBootJPA.repositories;

import com.diegojunio.SpringBootJPA.entities.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<Users, Long> {
    List<Users>findAllByEmail(String str);
    List<Users> findAll();
    Optional<Users> findById(Integer id);

}
