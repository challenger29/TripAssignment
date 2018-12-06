package com.example.demo.trip;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface TripRepository extends CrudRepository<Trip , Long> {
    public List<Trip> findByCustomerId(Long customerId);
}
