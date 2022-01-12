package com.example.springbootrestapiwithrelationshipmapping.ServiceImpl;

import com.example.springbootrestapiwithrelationshipmapping.Model.User;
import com.example.springbootrestapiwithrelationshipmapping.Repository.UserRepository;
import com.example.springbootrestapiwithrelationshipmapping.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public User registerUser(User user) {

        return userRepository.save(user);
    }
}
