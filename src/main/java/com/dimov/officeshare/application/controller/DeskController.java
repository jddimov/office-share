package com.dimov.officeshare.application.controller;

import com.dimov.officeshare.application.dto.DeskDTO;
import com.dimov.officeshare.application.mapper.DeskMapper;
import com.dimov.officeshare.core.repository.DeskRepository;
import com.dimov.officeshare.core.service.DeskReservationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class DeskController {
    @Autowired
    DeskReservationService deskReservationService;
    @Autowired
    DeskMapper deskMapper;
    @Autowired
    DeskRepository deskRepository;

    @RequestMapping("/")
    public String welcome(){
        return "Welcome to my first Spring Boot Application";
    }

    @PostMapping("/desk")
    public String createDesk(@RequestBody DeskDTO deskDTO){

        deskReservationService.createDesk(deskMapper.deskDTOtoModel(deskDTO));

        return "Desk created successfully";
    }

    @DeleteMapping("/desk")
    public void deleteDesk(@RequestBody DeskDTO deskDTO){

        deskReservationService.deleteDesk(deskMapper.deskDTOtoModel(deskDTO));
    }

    @PutMapping("/desk")
    public String updateDesk(@RequestBody DeskDTO deskDTO){

        deskReservationService.createDesk(deskMapper.deskDTOtoModel(deskDTO));

        return "Desk updated successfully";
    }

    @GetMapping("/desk")
    public List<DeskDTO> getAllDesks(){

         return deskMapper.modelsToDeskDTOs(deskReservationService.getAllDesks());

    }

}
