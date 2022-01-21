package com.example.springbootrestapiwithrelationshipmapping.ServiceImpl;

import com.example.springbootrestapiwithrelationshipmapping.Model.Location;
import com.example.springbootrestapiwithrelationshipmapping.Model.User;
import com.example.springbootrestapiwithrelationshipmapping.Repository.UserRepository;
import com.example.springbootrestapiwithrelationshipmapping.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> findUserByLocationId(int id) {
        return userRepository.findUserByLocationId(id);
    }

    @Override
    public Optional<User> findUserById(int id) {
        return userRepository.findUserById(id);
    }

    @Override
    public User registerUser(User user, int id) {
        Location location = new Location(10);
        user.setLocation(location);
        return userRepository.save(user);
    }


    @Override
    public List<User> findAllUsers() {
        List<User> list = userRepository.findAll();
        return  list;
    }
}
