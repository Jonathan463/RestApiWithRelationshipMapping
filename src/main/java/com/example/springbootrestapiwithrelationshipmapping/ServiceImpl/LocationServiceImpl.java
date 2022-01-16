package com.example.springbootrestapiwithrelationshipmapping.ServiceImpl;

import com.example.springbootrestapiwithrelationshipmapping.Model.Location;
import com.example.springbootrestapiwithrelationshipmapping.Repository.LocationRepository;
import com.example.springbootrestapiwithrelationshipmapping.Services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class LocationServiceImpl implements LocationService {

//    private LocationService locationService;

    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }
//    @Autowired
//    public LocationServiceImpl(LocationService locationService) {
//        this.locationService = locationService;
//    }



    @Override
    public Location addLocation(Location location) {
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
}
