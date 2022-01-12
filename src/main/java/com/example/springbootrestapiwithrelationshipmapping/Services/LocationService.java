package com.example.springbootrestapiwithrelationshipmapping.Services;

import com.example.springbootrestapiwithrelationshipmapping.Model.Location;
import org.springframework.stereotype.Service;

@Service
public interface LocationService {
    Location addLocation(Location location);
    Location getAllPost();
    Location findPostById(String id);
}
