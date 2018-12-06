package com.example.demo.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverController {

    @Autowired
    private DriverService driverService;

    @RequestMapping("/drivers")
    public List<Driver> getAllDrivers(){
        return driverService.getAllDriver();
    }

    @RequestMapping(method = RequestMethod.POST ,value ="/driver")
    public void addDriver(@RequestBody Driver driver){
        driverService.addDriver(driver);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/driver/{id}")
    public void deleteDriver(@PathVariable("id") Long id){
        driverService.removeDriver(id);
    }

}
