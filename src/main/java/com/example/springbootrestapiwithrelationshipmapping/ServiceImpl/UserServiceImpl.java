package com.example.springbootrestapiwithrelationshipmapping.ServiceImpl;

import com.example.springbootrestapiwithrelationshipmapping.Model.Location;
import com.example.springbootrestapiwithrelationshipmapping.Model.User;
import com.example.springbootrestapiwithrelationshipmapping.Repository.LocationRepository;
import com.example.springbootrestapiwithrelationshipmapping.Repository.UserRepository;
import com.example.springbootrestapiwithrelationshipmapping.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private LocationRepository locationRepository;
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(LocationRepository locationRepository, UserRepository userRepository) {
        this.locationRepository = locationRepository;
        this.userRepository = userRepository;
    }


    @Override
    public Optional<User> findUserByLocationId(Integer id) {
//        return userRepository.findUserByLocationId(id);
        return userRepository.findAllUserByLocationId(id);
    }

    @Override
    public Optional<User> findUserById(int id) {
        return userRepository.findUserById(id);
    }

    @Override
    public User registerUser(User user) {
//        Location location = new Location(10);
//        locationRepository.save(user.getLocation());
//        Location loc = locationRepository.findLocationByName(user.getLocation());
//        user.setLocation(location);
//        user.setLocation(loc);
        return userRepository.save(user);
    }


    @Override
    public List<User> findAllUsers() {
        List<User> list = userRepository.findAll();
        return  list;
    }
}
