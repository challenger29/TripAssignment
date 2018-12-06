package com.example.demo.rating;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @RequestMapping(method = RequestMethod.POST , value="/addRatings")
    public void addRatings(){
        Rating r1 = Rating.builder().name("R1").value(1).build();
        Rating r2 = Rating.builder().name("R2").value(2).build();
        Rating r3 = Rating.builder().name("R3").value(3).build();
        ratingService.addRating(r1);
        ratingService.addRating(r2);
        ratingService.addRating(r3);
    }

    @RequestMapping("/allRatings")
    public List<Rating> getAllRatings(){
        return ratingService.getAllRatings();
    }
}
