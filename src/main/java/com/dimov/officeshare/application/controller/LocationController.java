package com.dimov.officeshare.application.controller;

import com.dimov.officeshare.core.model.Location;
import com.dimov.officeshare.core.service.LocationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LocationController {

    @Autowired
    LocationService locationService;

    @PostMapping("/location")
    public String createLocation(@RequestBody Location location){

        locationService.createLocation(location);

        return "Location created successfully";
    }

}
