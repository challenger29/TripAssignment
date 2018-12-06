package com.example.demo.driver;

import com.example.demo.trip.Trip;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="driver")
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private Double avgRating;

    @OneToMany
    @Getter @Setter
    private Set<Trip> trips;

}
