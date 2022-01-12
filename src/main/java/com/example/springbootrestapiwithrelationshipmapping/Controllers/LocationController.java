package com.example.springbootrestapiwithrelationshipmapping.Controllers;

import com.example.springbootrestapiwithrelationshipmapping.Model.Location;
import com.example.springbootrestapiwithrelationshipmapping.ServiceImpl.LocationServiceImpl;
import com.example.springbootrestapiwithrelationshipmapping.Services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
