package com.example.springbootrestapiwithrelationshipmapping.Services;

import com.example.springbootrestapiwithrelationshipmapping.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    Optional<User>  findUserByLocationId(int id);
    Optional<User> findUserById(int id);
    User registerUser(User user);
    List<User> findAllUsers();

}
