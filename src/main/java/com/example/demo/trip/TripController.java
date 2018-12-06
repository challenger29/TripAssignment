package com.example.demo.trip;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TripController {

    @Autowired
    private TripService tripService;

    @RequestMapping("/allTrips")
    public List<Trip> getAllTrips(){
        return tripService.getAllTrips();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addTrip")
    public void addTrip(@RequestBody Long driverId ,  @RequestBody Long customerId  , @RequestBody Integer driverRating , @RequestBody Integer customerRating) {
        tripService.addTrip(driverId,customerId,driverRating,customerRating);
    }
}
