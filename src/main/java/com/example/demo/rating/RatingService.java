package com.example.demo.rating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    public List<Rating> getAllRatings(){
        List<Rating> ratings = new ArrayList<>();
        ratingRepository.findAll().forEach(ratings::add);
        return ratings;
    }

    public void addRating(Rating rating){
        ratingRepository.save(rating);
    }
    public String findByName(String name){
        return ratingRepository.findValueByName(name);
    }
    public Rating getByValue(Integer value){
        return ratingRepository.findByValue(value);
    }
}
