package com.example.springbootrestapiwithrelationshipmapping.Services;

import com.example.springbootrestapiwithrelationshipmapping.Model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findByEmail(String email);
    User registerUser(User user);
    User findAllUsers();

}
