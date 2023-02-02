package com.api.Springboot.API.Testing.controller;

import com.api.Springboot.API.Testing.entity.User;
import com.api.Springboot.API.Testing.repository.UserRepository;
import com.api.Springboot.API.Testing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserService service;
    @Autowired
    private UserRepository userRepository;

    //Post Requests
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return service.saveUser(user);
    }
    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> users){
        return service.saveUsers(users);
    }

    // Get Requests
    @GetMapping("/users")
    public List<User> findAllUsers(){
        return service.getUsers();
    }
    // Any input to be passed as part of parameter should be sent @PathVariable and use {} in args
    @GetMapping("/userByID/{id}")
    public User findUserByID(@PathVariable int id){
        return service.getUserByID(id);
    }
    @GetMapping("/userByName/{name}")
    public User findUserByName(@PathVariable String name){
        return service.getUserByName(name);
    }
    // Update or Put Requests
    @PutMapping("/update")
    public User updateUser(@RequestBody User user){
        return service.updateUser(user);
    }
    // Delete Requests
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        return service.deleteUser(id);
    }


}
