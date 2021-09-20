package com.dimov.officeshare.application.mapper;

import com.dimov.officeshare.application.dto.LocationDTO;
import com.dimov.officeshare.core.model.Location;
import org.springframework.stereotype.Component;

@Component
public class LocationMapper {

    public Location locationDTOtoModel(LocationDTO locationDTO){
        Location location = new Location();
        location.setId(locationDTO.getId());
        location.setName(locationDTO.getName());
        location.setAddress(locationDTO.getAddress());
        return location;
    }

    public LocationDTO modelToLocationDTO(Location location){
        LocationDTO locationDTO = new LocationDTO();
        if(location == null){
            return locationDTO;
        }
        locationDTO.setId(location.getId());
        locationDTO.setName(location.getName());
        locationDTO.setAddress(location.getAddress());
        return locationDTO;
    }
}
