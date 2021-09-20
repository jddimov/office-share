package com.dimov.officeshare.core.repository;

import com.dimov.officeshare.core.model.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {
}
