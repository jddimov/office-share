package com.dimov.officeshare.core.service;

import com.dimov.officeshare.core.model.Location;
import com.dimov.officeshare.core.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @Autowired
    private LocationRepository repository;

    public void createLocation(Location location){
        repository.save(location);
    }
}
