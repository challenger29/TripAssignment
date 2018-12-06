package com.example.demo.rating;

import lombok.*;

import javax.persistence.*;

@Builder
@Entity
@Table(name = "trip")
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    Long id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private Integer value;

}
