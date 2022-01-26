package com.example.springbootrestapiwithrelationshipmapping.Services;

import com.example.springbootrestapiwithrelationshipmapping.Model.User;
import com.example.springbootrestapiwithrelationshipmapping.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    Optional<User> findUserByLocationId(Integer id);
    Optional<User> findUserById(int id);
    User registerUser(UserDTO user);
    List<User> findAllUsers();

}
