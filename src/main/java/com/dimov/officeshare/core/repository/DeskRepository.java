package com.dimov.officeshare.core.repository;

import com.dimov.officeshare.core.model.Desk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeskRepository extends CrudRepository<Desk , Long> {

}
