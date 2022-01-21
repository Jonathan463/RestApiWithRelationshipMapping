package com.example.springbootrestapiwithrelationshipmapping.Controllers;

import com.example.springbootrestapiwithrelationshipmapping.Model.User;
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



    @PostMapping("addUser/{id}")
    User addUsers(@RequestBody User user,@PathVariable(value = "id") int id){
        return userService.registerUser(user,id);
    }

    @GetMapping("users")
    List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("user/{id}")
    Optional<User> getUser(@PathVariable(value = "id") int id){
        return userService.findUserById(id);
    }

    @GetMapping("/location/{id}/users")
    public List<User> getUsersByLocation(@PathVariable Integer id){
        List<User> users = userService.findUserByLocationId(id);

        System.out.println(users);
//        if(location.isPresent()){
////            List<User> newLocation = location.get();
////            return ;
//        }
        return users;
    }
}
