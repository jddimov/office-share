package com.dimov.officeshare.core.service;

import com.dimov.officeshare.core.model.Desk;
import com.dimov.officeshare.core.repository.DeskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeskReservationService {
    @Autowired
    private DeskRepository repository;

    public void reserveDesk(Desk desk){

    }

    public void createDesk(Desk desk){
        repository.save(desk);
    }

    public void deleteDesk(Desk desk){
        repository.delete(desk);
    }

    public List<Desk> getAllDesks(){
        List<Desk> desks = new ArrayList<>();
        repository.findAll().iterator().forEachRemaining(e -> desks.add(e));
        return desks;
    }
}
