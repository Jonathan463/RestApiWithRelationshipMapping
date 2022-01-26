package com.example.springbootrestapiwithrelationshipmapping.ServiceImpl;

import com.example.springbootrestapiwithrelationshipmapping.Model.Location;
import com.example.springbootrestapiwithrelationshipmapping.Model.User;
import com.example.springbootrestapiwithrelationshipmapping.Repository.LocationRepository;
import com.example.springbootrestapiwithrelationshipmapping.Repository.UserRepository;
import com.example.springbootrestapiwithrelationshipmapping.Services.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class LocationServiceImpl implements LocationService {

//    private LocationService locationService;
    private final UserRepository userRepository;
    private final LocationRepository locationRepository;

    public LocationServiceImpl(UserRepository userRepository, LocationRepository locationRepository) {
        this.userRepository = userRepository;
        this.locationRepository = locationRepository;
    }
//    @Autowired
//    public LocationServiceImpl(LocationService locationService) {
//        this.locationService = locationService;
//    }



    @Override
    public Location addLocation(Location location, Integer id) {
        User user = userRepository.findUserById(id).get();
        location.setUsers(user);
        return locationRepository.save(location);
    }

    @Override
    public List<Location> getAllPost() {
        return locationRepository.findAll();
    }

    @Override
    public Optional<Location> findLocationById(int id) {
        return locationRepository.findLocationById(id);
    }

    @Override
    public Optional<Location> findById(Integer id) {
        return locationRepository.findById(id);
    }
}
