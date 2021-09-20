package com.dimov.officeshare.application.mapper;

import com.dimov.officeshare.application.dto.DeskDTO;
import com.dimov.officeshare.core.model.Desk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DeskMapper {

    @Autowired
    private LocationMapper locationMapper;

    public Desk deskDTOtoModel(DeskDTO deskDTO){
        Desk desk = new Desk();
        desk.setId(deskDTO.getId());
        desk.setPrice(deskDTO.getPrice());
        desk.setType(deskDTO.getType());
        desk.setLocation(locationMapper.locationDTOtoModel(deskDTO.getLocation()));
        return desk;
    }
    public DeskDTO modelToDeskDTO(Desk desk){
        DeskDTO deskDTO = new DeskDTO();
        deskDTO.setId(desk.getId());
        deskDTO.setPrice(desk.getPrice());
        deskDTO.setType(desk.getType());
        deskDTO.setLocation(locationMapper.modelToLocationDTO(desk.getLocation()));
        return deskDTO;
    }

    public List<DeskDTO> modelsToDeskDTOs(List<Desk> desks){
        return desks.stream().map(this::modelToDeskDTO).collect(Collectors.toList());
    }
}
