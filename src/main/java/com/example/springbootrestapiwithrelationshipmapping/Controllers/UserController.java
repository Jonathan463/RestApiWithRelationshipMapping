package com.example.springbootrestapiwithrelationshipmapping.Controllers;

import com.example.springbootrestapiwithrelationshipmapping.Model.User;
import com.example.springbootrestapiwithrelationshipmapping.ServiceImpl.UserServiceImpl;
import com.example.springbootrestapiwithrelationshipmapping.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }



    @PostMapping("addUser")
    User addUsers(@RequestBody User user){
        return userService.registerUser(user);
    }

    @GetMapping("users")
    List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("user/{id}")
    Optional<User> getUser(@PathVariable(value = "id") int id){
        return userService.findById(id);
    }
}
