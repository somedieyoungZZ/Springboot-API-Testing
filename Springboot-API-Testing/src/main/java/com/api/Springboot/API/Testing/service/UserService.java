package com.api.Springboot.API.Testing.service;

import com.api.Springboot.API.Testing.entity.User;
import com.api.Springboot.API.Testing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    // Post Methods
    public User saveUser(User user){
        return repository.save(user);
    }

    public List<User> saveUsers(List<User> users){
        return repository.saveAll(users);
    }

    // Get Method
    public List<User> getUsers(){
        return repository.findAll();
    }
    // Get by ID
    public User getUserByID(int id){
        return repository.findById(id).orElse(null);
    }

    // Get Username
    public User getUserByName(String name){
        return repository.findByName(name);
    }

    // Delete Method
    public String deleteUser(int id){
        repository.deleteById(id);
        return id + " User Removed";
    }

    // Update Product
    public User updateUser(User user){
        User existingUser=repository.findById(user.getId()).orElse(null); // fetch user in db
//        assert existingUser != null;
        existingUser.setName(user.getName()); // new inputs passed ab object
        existingUser.setAge(user.getAge());
        existingUser.setDob(user.getDob());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword((user.getPassword()));
        return repository.save(existingUser); // populate new data in existing methoda
    }
}
