package com.example.demo.trip;

import java.util.List;

import com.example.demo.driver.Temp;
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
    public void addTrip(@RequestBody Temp temp ) {
        tripService.addTrip(temp.getDriverId(), temp.getCustomerId(),temp.getCustomerRating(),temp.getDriverRating());
    }
}
