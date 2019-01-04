package com.example.demo.trip;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TripController {

    @Autowired
    private TripService tripService;

    @RequestMapping("/allTrips")
    public List<Trip> getAllTrips(){
        return tripService.getAllTrips();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addTrip/driver/{driverId}/customer/{customerId}")
    public void addTrip(@PathVariable Long driverId , @PathVariable Long customerId  , Integer driverRating , Integer customerRating) {
        tripService.addTrip(driverId,customerId,driverRating,customerRating);
    }
}
