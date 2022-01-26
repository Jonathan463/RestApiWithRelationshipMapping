package com.example.springbootrestapiwithrelationshipmapping.Controllers;

import com.example.springbootrestapiwithrelationshipmapping.Model.Location;
import com.example.springbootrestapiwithrelationshipmapping.Model.Post;
import com.example.springbootrestapiwithrelationshipmapping.Model.User;
import com.example.springbootrestapiwithrelationshipmapping.ServiceImpl.LocationServiceImpl;
import com.example.springbootrestapiwithrelationshipmapping.Services.LocationService;
import com.example.springbootrestapiwithrelationshipmapping.Services.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class LocationController {


    private LocationService locationService;
    private UserService userService;

    @Autowired
    public LocationController(LocationService locationService, UserService userService) {
        this.locationService = locationService;
        this.userService = userService;
    }


//    @PostMapping(path="addLocation", produces = MediaType.APPLICATION_JSON_VALUE,consumes =  MediaType.APPLICATION_JSON_VALUE)
//    Location addLocations(@RequestBody Location location){
//        return locationService.addLocation(location);
//    }
    @PostMapping("addLocation/{id}")
    Location addLocation(@PathVariable("id") Integer id, @RequestBody Location location){
        return locationService.addLocation(location,id);
    }

    @GetMapping("getLocation/{id}")
    Optional<Location> getLocationById(@PathVariable(value = "id") int id){
        return locationService.findLocationById(id);
    }


}
