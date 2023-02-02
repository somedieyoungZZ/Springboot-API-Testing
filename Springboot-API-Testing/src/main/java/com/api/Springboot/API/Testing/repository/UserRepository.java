package com.api.Springboot.API.Testing.repository;

import com.api.Springboot.API.Testing.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByName(String name);
}
