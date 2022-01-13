package com.example.springbootrestapiwithrelationshipmapping.Controllers;

import com.example.springbootrestapiwithrelationshipmapping.Model.Location;
import com.example.springbootrestapiwithrelationshipmapping.Model.Post;
import com.example.springbootrestapiwithrelationshipmapping.ServiceImpl.LocationServiceImpl;
import com.example.springbootrestapiwithrelationshipmapping.Services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class LocationController {


    private LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }


    @PostMapping("addLocation")
    Location addLocations(@RequestBody Location location){
        return locationService.addLocation(location);
    }

    @GetMapping("getLocation/{id}")
    Optional<Location> getLocationById(@PathVariable(value = "id") int id){
        return locationService.findLocationById(id);
    }
}
