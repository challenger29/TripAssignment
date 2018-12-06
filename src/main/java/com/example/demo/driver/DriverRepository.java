package com.example.demo.driver;

import org.springframework.data.repository.CrudRepository;

public interface DriverRepository extends CrudRepository<Driver,Long> {

    public void deleteByName(String name);
}
