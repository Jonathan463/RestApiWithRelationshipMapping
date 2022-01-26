package com.example.springbootrestapiwithrelationshipmapping.Services;

import com.example.springbootrestapiwithrelationshipmapping.Model.Location;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface LocationService {
    Location addLocation(Location location, Integer id);
    List<Location> getAllPost();
    Optional<Location> findLocationById(int id);
    Optional<Location> findById(Integer id);
}
