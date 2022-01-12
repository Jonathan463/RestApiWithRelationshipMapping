package com.example.springbootrestapiwithrelationshipmapping.Controllers;

import com.example.springbootrestapiwithrelationshipmapping.Model.User;
import com.example.springbootrestapiwithrelationshipmapping.ServiceImpl.UserServiceImpl;
import com.example.springbootrestapiwithrelationshipmapping.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
