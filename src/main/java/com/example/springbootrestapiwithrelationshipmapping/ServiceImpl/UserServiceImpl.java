package com.example.springbootrestapiwithrelationshipmapping.ServiceImpl;

import com.example.springbootrestapiwithrelationshipmapping.Model.Location;
import com.example.springbootrestapiwithrelationshipmapping.Model.User;
import com.example.springbootrestapiwithrelationshipmapping.Repository.LocationRepository;
import com.example.springbootrestapiwithrelationshipmapping.Repository.UserRepository;
import com.example.springbootrestapiwithrelationshipmapping.Services.UserService;
import com.example.springbootrestapiwithrelationshipmapping.dto.UserDTO;
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
    public User registerUser(UserDTO userDTO) {
        Location location = new Location();
        User user = new User();
        location.setName(userDTO.getLocation());
        locationRepository.save(location);

        Location loc = locationRepository.findLocationByName(location.getName());
        System.out.println(loc);
//        user.setLocation(location);
        user.setFirstname(userDTO.getFirstname());
        user.setLastname(userDTO.getLastname());
        user.setEmail(userDTO.getEmail());
        user.setLocation(loc);
        return userRepository.save(user);
    }


    @Override
    public List<User> findAllUsers() {
        List<User> list = userRepository.findAll();
        return  list;
    }
}
