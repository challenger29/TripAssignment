package com.example.demo.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public void addDriver(Driver driver){
        System.out.println(driver);
        driverRepository.save(driver);
    }
    public List<Driver> getAllDriver(){
        List<Driver> drivers = new ArrayList<>();
        driverRepository.findAll().forEach(drivers::add);
        return drivers;
    }
    public boolean removeDriver(Long id){
        driverRepository.deleteById(id);
        return true;
    }
    public Optional<Driver> findDriverById(Long id){
        return driverRepository.findById(id);
    }
}
