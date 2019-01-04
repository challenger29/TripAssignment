package com.example.demo.driver;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="driver")
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Builder
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    @Column(name="driver_id")
    private Long id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private Double avgRating;

}
