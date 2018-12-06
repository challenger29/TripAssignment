package com.example.demo.rating;

import org.springframework.data.repository.CrudRepository;

public interface RatingRepository extends CrudRepository<Rating, Long> {

    String findValueByName(String name);

    Rating findByValue(Integer value);
}
