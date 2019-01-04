package com.example.demo.trip;

import com.example.demo.customer.Customer;
import com.example.demo.customer.CustomerService;
import com.example.demo.driver.Driver;
import com.example.demo.driver.DriverService;
import com.example.demo.rating.Rating;
import com.example.demo.rating.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;

    @Autowired
    private DriverService driverService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private RatingService ratingService;

    public List<Trip> getAllTrips(){
        List<Trip> trips = new ArrayList<>();
        tripRepository.findAll().forEach(trips::add);
        return trips;
    }
    public void addTrip(Long driverId , Long customerId , Integer driverRating , Integer customerRating ){
        Optional<Driver> driver = driverService.findDriverById(driverId);
        Optional<Customer> customer = customerService.findCustomerById(customerId);
        if(driver.isPresent() && customer.isPresent() ){
            Trip trip = new Trip();
            trip.setDriver(driver.get());
            trip.setCustomer(customer.get());
            trip.setDriverRating(ratingService.getByValue(driverRating));
            trip.setCustomerRating(ratingService.getByValue(customerRating));
            tripRepository.save(trip);
            System.out.println(trip.toString());
        }
    }
    public List<Trip> findTripByCustomer( Long customerId){
        return tripRepository.findByCustomerId(customerId);
    }
}
